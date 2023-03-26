package self_checkout_experience.generator;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public abstract class ETLRunner {
  protected abstract String getSource();
  
  protected abstract List<IModel> getModels() throws Exception;
  
  public EObject execute() throws Exception {
    EObject _xblockexpression = null;
    {
      final EtlModule module = new EtlModule();
      module.parse(this.getFileURI(this.getSource()));
      int _size = module.getParseProblems().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        System.err.println("Parse errors occured...");
        final Consumer<ParseProblem> _function = (ParseProblem it) -> {
          System.err.println(it.toString());
        };
        module.getParseProblems().forEach(_function);
        return null;
      }
      final Consumer<IModel> _function_1 = (IModel it) -> {
        module.getContext().getModelRepository().addModel(it);
      };
      this.getModels().forEach(_function_1);
      module.execute();
      IModel _modelByName = module.getContext().getModelRepository().getModelByName("Target");
      final EObject result = IterableExtensions.<EObject>head(((EmfModel) _modelByName).getResource().getContents());
      module.getContext().getModelRepository().dispose();
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  protected EmfModel createEmfModel(final String name, final String model, final String metamodel, final boolean readOnLoad, final boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
    EmfModel _xblockexpression = null;
    {
      final EmfModel emfModel = new EmfModel();
      final StringProperties properties = new StringProperties();
      properties.put(EmfModel.PROPERTY_NAME, name);
      properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, this.getFileURI(metamodel).toString());
      properties.put(EmfModel.PROPERTY_MODEL_URI, this.getFileURI(model).toString());
      String _plus = (Boolean.valueOf(readOnLoad) + "");
      properties.put(EmfModel.PROPERTY_READONLOAD, _plus);
      String _plus_1 = (Boolean.valueOf(storeOnDisposal) + "");
      properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, _plus_1);
      emfModel.load(properties, ((IRelativePathResolver) null));
      _xblockexpression = emfModel;
    }
    return _xblockexpression;
  }
  
  protected EmfModel createEmfModelByURI(final String name, final String model, final String metamodel, final boolean readOnLoad, final boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
    EmfModel _xblockexpression = null;
    {
      final EmfModel emfModel = new EmfModel();
      final StringProperties properties = new StringProperties();
      properties.put(EmfModel.PROPERTY_NAME, name);
      properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
      properties.put(EmfModel.PROPERTY_MODEL_URI, this.getFileURI(model).toString());
      String _plus = (Boolean.valueOf(readOnLoad) + "");
      properties.put(EmfModel.PROPERTY_READONLOAD, _plus);
      String _plus_1 = (Boolean.valueOf(storeOnDisposal) + "");
      properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, _plus_1);
      emfModel.load(properties, ((IRelativePathResolver) null));
      _xblockexpression = emfModel;
    }
    return _xblockexpression;
  }
  
  protected EmfModel createInMemoryEmfModel(final Resource res, final String name, final String metamodel) throws EolModelLoadingException, URISyntaxException {
    return new InMemoryEmfModel(name, res, metamodel);
  }
  
  protected URI getFileURI(final String fileName) throws URISyntaxException {
    final URI binUri = ETLRunner.class.getResource(fileName).toURI();
    URI uri = null;
    int _indexOf = binUri.toString().indexOf("bin");
    boolean _greaterThan = (_indexOf > (-1));
    if (_greaterThan) {
      String _replaceAll = binUri.toString().replaceAll("bin", "src");
      URI _uRI = new URI(_replaceAll);
      uri = _uRI;
    } else {
      uri = binUri;
    }
    return uri;
  }
}
