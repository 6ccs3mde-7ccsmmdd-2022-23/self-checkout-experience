/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import self_checkout_experience.selfCheckoutExperience.AddToOnlineBasket;
import self_checkout_experience.selfCheckoutExperience.Addition;
import self_checkout_experience.selfCheckoutExperience.Carry;
import self_checkout_experience.selfCheckoutExperience.CarryItems;
import self_checkout_experience.selfCheckoutExperience.Checkout;
import self_checkout_experience.selfCheckoutExperience.ComplexScan;
import self_checkout_experience.selfCheckoutExperience.Confirm;
import self_checkout_experience.selfCheckoutExperience.DeliveryOptions;
import self_checkout_experience.selfCheckoutExperience.Drop;
import self_checkout_experience.selfCheckoutExperience.HoldSelfScanner;
import self_checkout_experience.selfCheckoutExperience.IntExpression;
import self_checkout_experience.selfCheckoutExperience.IntLiteral;
import self_checkout_experience.selfCheckoutExperience.IntVarExpression;
import self_checkout_experience.selfCheckoutExperience.MoveStatement;
import self_checkout_experience.selfCheckoutExperience.Multiplication;
import self_checkout_experience.selfCheckoutExperience.OnlineCheckout;
import self_checkout_experience.selfCheckoutExperience.Pay;
import self_checkout_experience.selfCheckoutExperience.PickStatement;
import self_checkout_experience.selfCheckoutExperience.RemoveFromOnlineBasket;
import self_checkout_experience.selfCheckoutExperience.Repeat;
import self_checkout_experience.selfCheckoutExperience.Scan;
import self_checkout_experience.selfCheckoutExperience.ScanAndAddToBasket;
import self_checkout_experience.selfCheckoutExperience.ScanExpression;
import self_checkout_experience.selfCheckoutExperience.Search;
import self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperience;
import self_checkout_experience.selfCheckoutExperience.SelfCheckoutExperiencePackage;
import self_checkout_experience.selfCheckoutExperience.SelfCheckoutInstore;
import self_checkout_experience.selfCheckoutExperience.SelfCheckoutOnline;
import self_checkout_experience.selfCheckoutExperience.Self_checkout;
import self_checkout_experience.selfCheckoutExperience.TurnCommand;
import self_checkout_experience.selfCheckoutExperience.TurnStatement;
import self_checkout_experience.selfCheckoutExperience.WalkStatement;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SelfCheckoutExperienceGenerator extends AbstractGenerator {
  private static class ConstantFolder extends ETLRunner {
    private final Resource inModel;
    
    public ConstantFolder(final Resource inModel) {
      this.inModel = inModel;
    }
    
    @Override
    protected String getSource() {
      return "incentives.etl";
    }
    
    @Override
    protected List<IModel> getModels() throws Exception {
      List<IModel> _xblockexpression = null;
      {
        final EmfModel srcModel = this.createInMemoryEmfModel(this.inModel, "Source", SelfCheckoutExperiencePackage.eNS_URI);
        final ResourceSet resourceSet = this.inModel.getResourceSet();
        final URI tgtResourceURI = URI.createFileURI("synthetic.selfcheckoutexp");
        Resource tgtResource = resourceSet.getResource(tgtResourceURI, false);
        boolean _notEquals = (!Objects.equal(tgtResource, null));
        if (_notEquals) {
          tgtResource.getContents().clear();
        } else {
          tgtResource = resourceSet.createResource(tgtResourceURI);
        }
        final EmfModel tgtModel = this.createInMemoryEmfModel(tgtResource, "Target", SelfCheckoutExperiencePackage.eNS_URI);
        _xblockexpression = Collections.<IModel>unmodifiableList(CollectionLiterals.<IModel>newArrayList(srcModel, tgtModel));
      }
      return _xblockexpression;
    }
  }
  
  private static class Environment {
    private int counter = 0;
    
    public CharSequence getFreshVarName() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i");
      int _plusPlus = this.counter++;
      _builder.append(_plusPlus);
      return _builder;
    }
    
    public int exit() {
      return this.counter--;
    }
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      EObject _head = IterableExtensions.<EObject>head(resource.getContents());
      final Self_checkout model = ((Self_checkout) _head);
      final String className = this.deriveClassName(resource);
      EObject _execute = new SelfCheckoutExperienceGenerator.ConstantFolder(resource).execute();
      final Self_checkout interimModel = ((Self_checkout) _execute);
      fsa.generateFile((className + ".txt"), this.generate(model));
      fsa.generateFile((className + ".java"), this.doGenerateClass(interimModel, className));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String deriveClassName(final Resource resource) {
    String _xblockexpression = null;
    {
      final String origFileName = resource.getURI().lastSegment();
      String _firstUpper = StringExtensions.toFirstUpper(origFileName.substring(0, origFileName.indexOf(".")));
      _xblockexpression = (_firstUpper + "Self_checkout");
    }
    return _xblockexpression;
  }
  
  public CharSequence generate(final Self_checkout checkout) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Self checkout summary:");
    _builder.newLine();
    _builder.append("IN STORE ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("- ");
    int _size = IteratorExtensions.size(Iterators.<PickStatement>filter(checkout.eAllContents(), PickStatement.class));
    _builder.append(_size, "\t");
    _builder.append(" pick statements");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("- ");
    int _size_1 = IteratorExtensions.size(Iterators.<ScanAndAddToBasket>filter(checkout.eAllContents(), ScanAndAddToBasket.class));
    _builder.append(_size_1, "\t");
    _builder.append(" scan and add to basket statements");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("- ");
    int _size_2 = IteratorExtensions.size(Iterators.<Drop>filter(checkout.eAllContents(), Drop.class));
    _builder.append(_size_2, "\t");
    _builder.append(" drop statements");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("- ");
    int _size_3 = IteratorExtensions.size(Iterators.<Checkout>filter(checkout.eAllContents(), Checkout.class));
    _builder.append(_size_3, "\t");
    _builder.append(" go to self-checkout statements");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("- ");
    int _size_4 = IteratorExtensions.size(Iterators.<Scan>filter(checkout.eAllContents(), Scan.class));
    _builder.append(_size_4, "\t");
    _builder.append(" scan statements");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("- ");
    int _size_5 = IteratorExtensions.size(Iterators.<CarryItems>filter(checkout.eAllContents(), CarryItems.class));
    _builder.append(_size_5, "\t");
    _builder.append(" carry item statements");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("- ");
    int _size_6 = IteratorExtensions.size(Iterators.<MoveStatement>filter(checkout.eAllContents(), MoveStatement.class));
    _builder.append(_size_6, "\t");
    _builder.append(" move statements");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("- ");
    int _size_7 = IteratorExtensions.size(Iterators.<TurnStatement>filter(checkout.eAllContents(), TurnStatement.class));
    _builder.append(_size_7, "\t");
    _builder.append(" turn statements");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("- ");
    int _size_8 = IteratorExtensions.size(Iterators.<Repeat>filter(checkout.eAllContents(), Repeat.class));
    _builder.append(_size_8, "\t");
    _builder.append(" repeat statements");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("- ");
    int _size_9 = IteratorExtensions.size(Iterators.<WalkStatement>filter(checkout.eAllContents(), WalkStatement.class));
    _builder.append(_size_9, "\t");
    _builder.append(" Walk statements");
    _builder.newLineIfNotEmpty();
    _builder.append("ONLINE");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("- ");
    int _size_10 = IteratorExtensions.size(Iterators.<Search>filter(checkout.eAllContents(), Search.class));
    _builder.append(_size_10, "\t");
    _builder.append(" search statements");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("- ");
    int _size_11 = IteratorExtensions.size(Iterators.<AddToOnlineBasket>filter(checkout.eAllContents(), AddToOnlineBasket.class));
    _builder.append(_size_11, "\t");
    _builder.append(" add to online basket statements");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("- ");
    int _size_12 = IteratorExtensions.size(Iterators.<RemoveFromOnlineBasket>filter(checkout.eAllContents(), RemoveFromOnlineBasket.class));
    _builder.append(_size_12, "\t");
    _builder.append(" remove from online basket statements");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence doGenerateClass(final Self_checkout program, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.stream.Collectors;");
    _builder.newLine();
    _builder.append("import java.util.Map;");
    _builder.newLine();
    _builder.append("import java.util.Iterator;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ArrayList<String> items = new ArrayList<String>();  // Create an ArrayList object");
    _builder.newLine();
    _builder.append("\t\t");
    final Function1<SelfCheckoutExperience, String> _function = (SelfCheckoutExperience it) -> {
      SelfCheckoutExperienceGenerator.Environment _environment = new SelfCheckoutExperienceGenerator.Environment();
      return this.generateJavaStatement(it, _environment);
    };
    String _join = IterableExtensions.join(ListExtensions.<SelfCheckoutExperience, String>map(program.getSelfCheckoutExperience(), _function), "\n");
    _builder.append(_join, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected String _generateJavaStatement(final SelfCheckoutInstore sci, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"You have entered the store\");");
    _builder.newLine();
    _builder.append("System.out.println(\"***We are giving away EXTRA items for your purchases for using the selfcheckout!***\\n\");");
    _builder.newLine();
    String _xifexpression = null;
    HoldSelfScanner _pickScanMachine = sci.getPickScanMachine();
    boolean _tripleNotEquals = (_pickScanMachine != null);
    if (_tripleNotEquals) {
      _xifexpression = this.generateJavaStatement(sci.getPickScanMachine(), env);
    }
    _builder.append(_xifexpression);
    _builder.newLineIfNotEmpty();
    final Function1<EObject, String> _function = (EObject it) -> {
      return this.generateJavaStatement(it, env);
    };
    String _join = IterableExtensions.join(ListExtensions.<EObject, String>map(sci.getStatement(), _function), "\n");
    _builder.append(_join);
    _builder.newLineIfNotEmpty();
    String _xifexpression_1 = null;
    Checkout _checkout = sci.getCheckout();
    boolean _tripleNotEquals_1 = (_checkout != null);
    if (_tripleNotEquals_1) {
      _xifexpression_1 = this.generateJavaStatement(sci.getCheckout(), env);
    }
    _builder.append(_xifexpression_1);
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final HoldSelfScanner sci, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Self Checkout Scanner aquired\");");
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final PickStatement picksmnt, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Picked up: ");
    String _generateJavaExpression = this.generateJavaExpression(picksmnt.getItemCount());
    _builder.append(_generateJavaExpression);
    _builder.append(" ");
    String _firstUpper = StringExtensions.toFirstUpper(picksmnt.getItemPicked().getName());
    _builder.append(_firstUpper);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    String _xifexpression = null;
    EObject _holdingItem = picksmnt.getHoldingItem();
    boolean _tripleNotEquals = (_holdingItem != null);
    if (_tripleNotEquals) {
      _xifexpression = this.generateJavaStatement(picksmnt.getHoldingItem(), this.generateJavaExpression(picksmnt.getItemCount()), env);
    }
    _builder.append(_xifexpression);
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final ScanAndAddToBasket item, final String itemCount, final SelfCheckoutExperienceGenerator.Environment env) {
    String _xblockexpression = null;
    {
      final CharSequence freshVarName = env.getFreshVarName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("System.out.println(\"Adding ");
      String _name = item.getItemInBasket().getName();
      _builder.append(_name);
      _builder.append(" in basket\\n\");");
      _builder.newLineIfNotEmpty();
      _builder.append("for (int ");
      _builder.append(freshVarName);
      _builder.append(" = 0; ");
      _builder.append(freshVarName);
      _builder.append(" < ");
      _builder.append(itemCount);
      _builder.append("; ");
      _builder.append(freshVarName);
      _builder.append("++) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("items.add(\"");
      String _name_1 = item.getItemInBasket().getName();
      _builder.append(_name_1, "\t");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      final String result = _builder.toString();
      env.exit();
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  protected String _generateJavaStatement(final Drop item, final String itemCount, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Dropping ");
    String _name = item.getItemDropped().getName();
    _builder.append(_name);
    _builder.append("\\n\");");
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final WalkStatement smnt, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final MoveStatement smnt, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Move ");
    String _firstUpper = StringExtensions.toFirstUpper(smnt.getCommand().getName());
    _builder.append(_firstUpper);
    _builder.append(" (");
    String _generateJavaExpression = this.generateJavaExpression(smnt.getSteps());
    _builder.append(_generateJavaExpression);
    _builder.append(")\");");
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final TurnStatement smnt, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Turn ");
    TurnCommand _command = smnt.getCommand();
    _builder.append(_command);
    _builder.append("\");");
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final Repeat stmt, final SelfCheckoutExperienceGenerator.Environment env) {
    String _xblockexpression = null;
    {
      final CharSequence freshVarName = env.getFreshVarName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("for (int ");
      _builder.append(freshVarName);
      _builder.append(" = 0; ");
      _builder.append(freshVarName);
      _builder.append(" < ");
      String _generateJavaExpression = this.generateJavaExpression(stmt.getCount());
      _builder.append(_generateJavaExpression);
      _builder.append("; ");
      _builder.append(freshVarName);
      _builder.append("++) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      final Function1<EObject, String> _function = (EObject it) -> {
        return this.generateJavaStatement(it, env);
      };
      String _join = IterableExtensions.join(ListExtensions.<EObject, String>map(stmt.getStatement(), _function), "\n");
      _builder.append(_join, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      final String result = _builder.toString();
      env.exit();
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  protected String _generateJavaStatement(final Checkout checkout, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Going to checkout\");");
    _builder.newLine();
    String _xifexpression = null;
    ScanExpression _scan = checkout.getScan();
    boolean _tripleNotEquals = (_scan != null);
    if (_tripleNotEquals) {
      _xifexpression = this.generateJavaStatement(checkout.getScan(), env);
    }
    _builder.append(_xifexpression);
    _builder.newLineIfNotEmpty();
    String _xifexpression_1 = null;
    Pay _pay = checkout.getPay();
    boolean _tripleNotEquals_1 = (_pay != null);
    if (_tripleNotEquals_1) {
      _xifexpression_1 = this.checkingOutOfStore();
    }
    _builder.append(_xifexpression_1);
    _builder.newLineIfNotEmpty();
    String _xifexpression_2 = null;
    Pay _pay_1 = checkout.getPay();
    boolean _tripleNotEquals_2 = (_pay_1 != null);
    if (_tripleNotEquals_2) {
      _xifexpression_2 = this.generateJavaStatement(checkout.getPay(), env);
    }
    _builder.append(_xifexpression_2);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String checkingOutOfStore() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Checking out of store\\n\");");
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final ScanExpression se, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final Scan scan, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Load self scanner onto till\");");
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final ComplexScan compscan, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateJavaStatement = this.generateJavaStatement(compscan.getStart(), env);
    _builder.append(_generateJavaStatement);
    _builder.append("; ");
    final Function1<CarryItems, String> _function = (CarryItems se) -> {
      return this.generateJavaStatement(se, env);
    };
    String _join = IterableExtensions.join(ListExtensions.<CarryItems, String>map(compscan.getNext(), _function), "; ");
    _builder.append(_join);
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final CarryItems carryItems, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"carry in\" ");
    Carry _carry = carryItems.getCarry();
    _builder.append(_carry);
    _builder.append(" );");
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final IntExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final Addition exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _generateJavaExpression = this.generateJavaExpression(exp.getLeft());
    _builder.append(_generateJavaExpression);
    {
      int _size = exp.getOperator().size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer idx : _upTo) {
        _builder.append(" ");
        String _get = exp.getOperator().get((idx).intValue());
        _builder.append(_get);
        _builder.append(" ");
        String _generateJavaExpression_1 = this.generateJavaExpression(exp.getRight().get((idx).intValue()));
        _builder.append(_generateJavaExpression_1);
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final Multiplication exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateJavaExpression = this.generateJavaExpression(exp.getLeft());
    _builder.append(_generateJavaExpression);
    {
      int _size = exp.getOperator().size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for(final Integer idx : _upTo) {
        _builder.append(" ");
        String _get = exp.getOperator().get((idx).intValue());
        _builder.append(_get);
        _builder.append(" ");
        String _generateJavaExpression_1 = this.generateJavaExpression(exp.getRight().get((idx).intValue()));
        _builder.append(_generateJavaExpression_1);
      }
    }
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final IntLiteral exp) {
    StringConcatenation _builder = new StringConcatenation();
    int _val = exp.getVal();
    _builder.append(_val);
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final IntVarExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = exp.getVar().getValue();
    _builder.append(_value);
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final SelfCheckoutOnline online, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Iterator<String> i = items.iterator();");
    _builder.newLine();
    _builder.append("System.out.println(\"You have logged in\");");
    _builder.newLine();
    _builder.append("System.out.println(\"***We are giving an EXTRA item for every time you buy online!***\\n\");");
    _builder.newLine();
    final Function1<Search, String> _function = (Search it) -> {
      return this.generateJavaStatement(it, env);
    };
    String _join = IterableExtensions.join(ListExtensions.<Search, String>map(online.getSearch(), _function), "\n");
    _builder.append(_join);
    _builder.newLineIfNotEmpty();
    String _xifexpression = null;
    OnlineCheckout _onlineCheckout = online.getOnlineCheckout();
    boolean _tripleNotEquals = (_onlineCheckout != null);
    if (_tripleNotEquals) {
      _xifexpression = this.generateJavaStatement(online.getOnlineCheckout(), env);
    }
    _builder.append(_xifexpression);
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final Search search, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Searching for: ");
    String _name = search.getItemSearch().getName();
    _builder.append(_name);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    String _xifexpression = null;
    AddToOnlineBasket _addToOnlineBasket = search.getAddToOnlineBasket();
    boolean _tripleNotEquals = (_addToOnlineBasket != null);
    if (_tripleNotEquals) {
      _xifexpression = this.generateJavaStatement(search.getAddToOnlineBasket(), env);
    }
    _builder.append(_xifexpression);
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final AddToOnlineBasket basket, final SelfCheckoutExperienceGenerator.Environment env) {
    String _xblockexpression = null;
    {
      final CharSequence freshVarName = env.getFreshVarName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("System.out.println(\"Adding ");
      String _generateJavaExpression = this.generateJavaExpression(basket.getItemCount());
      _builder.append(_generateJavaExpression);
      _builder.append(" ");
      String _name = basket.getItem().getName();
      _builder.append(_name);
      _builder.append(" to basket\\n\");");
      _builder.newLineIfNotEmpty();
      _builder.append("for (int ");
      _builder.append(freshVarName);
      _builder.append(" = 0; ");
      _builder.append(freshVarName);
      _builder.append(" <  ");
      String _generateJavaExpression_1 = this.generateJavaExpression(basket.getItemCount());
      _builder.append(_generateJavaExpression_1);
      _builder.append("; ");
      _builder.append(freshVarName);
      _builder.append("++) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("items.add(\"");
      String _name_1 = basket.getItem().getName();
      _builder.append(_name_1, "\t");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      String _xifexpression = null;
      RemoveFromOnlineBasket _removeFromOnlineBasket = basket.getRemoveFromOnlineBasket();
      boolean _tripleNotEquals = (_removeFromOnlineBasket != null);
      if (_tripleNotEquals) {
        _xifexpression = this.generateJavaStatement(basket.getRemoveFromOnlineBasket(), env);
      }
      _builder.append(_xifexpression);
      _builder.newLineIfNotEmpty();
      final String result = _builder.toString();
      env.exit();
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  protected String _generateJavaStatement(final RemoveFromOnlineBasket itemRemove, final SelfCheckoutExperienceGenerator.Environment env) {
    String _xblockexpression = null;
    {
      final CharSequence freshVarName = env.getFreshVarName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("System.out.println(\"Removing ");
      String _name = itemRemove.getRemoveItem().getName();
      _builder.append(_name);
      _builder.append(" from basket\");");
      _builder.newLineIfNotEmpty();
      _builder.append("i = items.iterator();");
      _builder.newLine();
      _builder.append("while (i.hasNext()) {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("String str = (String) i.next();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if (str.equals(\"");
      String _name_1 = itemRemove.getRemoveItem().getName();
      _builder.append(_name_1, "\t");
      _builder.append("\")) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t ");
      _builder.append("i.remove();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}\t");
      _builder.newLine();
      final String result = _builder.toString();
      env.exit();
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  protected String _generateJavaStatement(final OnlineCheckout checkout, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    String _xifexpression = null;
    DeliveryOptions _deliveryOptions = checkout.getDeliveryOptions();
    boolean _tripleNotEquals = (_deliveryOptions != null);
    if (_tripleNotEquals) {
      _xifexpression = this.generateJavaStatement(checkout.getDeliveryOptions(), env);
    }
    _builder.append(_xifexpression);
    _builder.newLineIfNotEmpty();
    String _xifexpression_1 = null;
    Confirm _confirm = checkout.getConfirm();
    boolean _tripleNotEquals_1 = (_confirm != null);
    if (_tripleNotEquals_1) {
      _xifexpression_1 = this.generateJavaStatement(checkout.getConfirm(), env);
    }
    _builder.append(_xifexpression_1);
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final DeliveryOptions options, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Mode of delivery is ");
    String _name = options.getName();
    _builder.append(_name);
    _builder.append(" \");");
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final Confirm confirm, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Confirming order\"); ");
    _builder.newLine();
    _builder.append("System.out.println(\"Checking out of web store\\n\");");
    _builder.newLine();
    String _generateJavaStatement = this.generateJavaStatement(confirm.getPay(), env);
    _builder.append(_generateJavaStatement);
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final Pay pay, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"///////////////RECEIPT//////////////\" );");
    _builder.newLine();
    _builder.append("Map<Object, Long> counts =");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("items.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));");
    _builder.newLine();
    _builder.append("for(Map.Entry<Object, Long> entry : counts.entrySet()) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(\"- \" + entry.getKey() + \" x\" + entry.getValue());");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("System.out.println();");
    _builder.newLine();
    _builder.append("System.out.println(\"Number of items purchased: \" + items.size());");
    _builder.newLine();
    _builder.append("if(items.size() >= 20){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(\"///////////////VOUCHER///////////////\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(\"//    You bought over 20 items!    //\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(\"//     You\'ve earned a voucher     //\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(\"//    to spend on self-checkout    //\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(\"//     next time you shop here.    //\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(\"/////////////////////////////////////\");");
    _builder.newLine();
    _builder.append("}else {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(\"Next time you shop with us make sure to purchase 20 items or more when using the self checkout to earn a free voucher off your next self checkout order\");  //condition that we don\'t give voucher");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateJavaStatement(final Object compscan, final SelfCheckoutExperienceGenerator.Environment env) {
    if (compscan instanceof ComplexScan) {
      return _generateJavaStatement((ComplexScan)compscan, env);
    } else if (compscan instanceof MoveStatement) {
      return _generateJavaStatement((MoveStatement)compscan, env);
    } else if (compscan instanceof Repeat) {
      return _generateJavaStatement((Repeat)compscan, env);
    } else if (compscan instanceof Scan) {
      return _generateJavaStatement((Scan)compscan, env);
    } else if (compscan instanceof SelfCheckoutInstore) {
      return _generateJavaStatement((SelfCheckoutInstore)compscan, env);
    } else if (compscan instanceof SelfCheckoutOnline) {
      return _generateJavaStatement((SelfCheckoutOnline)compscan, env);
    } else if (compscan instanceof TurnStatement) {
      return _generateJavaStatement((TurnStatement)compscan, env);
    } else if (compscan instanceof AddToOnlineBasket) {
      return _generateJavaStatement((AddToOnlineBasket)compscan, env);
    } else if (compscan instanceof CarryItems) {
      return _generateJavaStatement((CarryItems)compscan, env);
    } else if (compscan instanceof Checkout) {
      return _generateJavaStatement((Checkout)compscan, env);
    } else if (compscan instanceof Confirm) {
      return _generateJavaStatement((Confirm)compscan, env);
    } else if (compscan instanceof DeliveryOptions) {
      return _generateJavaStatement((DeliveryOptions)compscan, env);
    } else if (compscan instanceof HoldSelfScanner) {
      return _generateJavaStatement((HoldSelfScanner)compscan, env);
    } else if (compscan instanceof OnlineCheckout) {
      return _generateJavaStatement((OnlineCheckout)compscan, env);
    } else if (compscan instanceof Pay) {
      return _generateJavaStatement((Pay)compscan, env);
    } else if (compscan instanceof PickStatement) {
      return _generateJavaStatement((PickStatement)compscan, env);
    } else if (compscan instanceof RemoveFromOnlineBasket) {
      return _generateJavaStatement((RemoveFromOnlineBasket)compscan, env);
    } else if (compscan instanceof ScanExpression) {
      return _generateJavaStatement((ScanExpression)compscan, env);
    } else if (compscan instanceof Search) {
      return _generateJavaStatement((Search)compscan, env);
    } else if (compscan instanceof WalkStatement) {
      return _generateJavaStatement((WalkStatement)compscan, env);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(compscan, env).toString());
    }
  }
  
  public String generateJavaStatement(final EObject item, final String itemCount, final SelfCheckoutExperienceGenerator.Environment env) {
    if (item instanceof Drop) {
      return _generateJavaStatement((Drop)item, itemCount, env);
    } else if (item instanceof ScanAndAddToBasket) {
      return _generateJavaStatement((ScanAndAddToBasket)item, itemCount, env);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(item, itemCount, env).toString());
    }
  }
  
  public String generateJavaExpression(final IntExpression exp) {
    if (exp instanceof Addition) {
      return _generateJavaExpression((Addition)exp);
    } else if (exp instanceof IntLiteral) {
      return _generateJavaExpression((IntLiteral)exp);
    } else if (exp instanceof IntVarExpression) {
      return _generateJavaExpression((IntVarExpression)exp);
    } else if (exp instanceof Multiplication) {
      return _generateJavaExpression((Multiplication)exp);
    } else if (exp != null) {
      return _generateJavaExpression(exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
}
