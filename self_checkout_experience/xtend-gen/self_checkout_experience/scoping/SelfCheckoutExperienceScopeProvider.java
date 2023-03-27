package self_checkout_experience.scoping;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import self_checkout_experience.selfCheckoutExperience.IntVarExpression;
import self_checkout_experience.selfCheckoutExperience.Repeat;
import self_checkout_experience.selfCheckoutExperience.SelfCheckoutInstore;
import self_checkout_experience.selfCheckoutExperience.VariableDeclaration;

@SuppressWarnings("all")
public class SelfCheckoutExperienceScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_IntVarExpression_var(final IntVarExpression context, final EReference ref) {
    IScope _xblockexpression = null;
    {
      final Repeat containedInLoop = EcoreUtil2.<Repeat>getContainerOfType(context, Repeat.class);
      IScope _xifexpression = null;
      if ((containedInLoop != null)) {
        _xifexpression = this.visibleVariablesScope(containedInLoop);
      } else {
        IScope _xblockexpression_1 = null;
        {
          final SelfCheckoutInstore containingProgram = EcoreUtil2.<SelfCheckoutInstore>getContainerOfType(context, SelfCheckoutInstore.class);
          _xblockexpression_1 = Scopes.scopeFor(Iterables.<VariableDeclaration>filter(containingProgram.getStatement(), VariableDeclaration.class));
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public IScope visibleVariablesScope(final EObject context) {
    IScope _xifexpression = null;
    if ((context instanceof Repeat)) {
      _xifexpression = Scopes.scopeFor(Iterables.<VariableDeclaration>filter(((Repeat)context).getStatement(), VariableDeclaration.class), this.visibleVariablesScope(((Repeat)context).eContainer()));
    } else {
      IScope _xifexpression_1 = null;
      if ((context instanceof SelfCheckoutInstore)) {
        _xifexpression_1 = Scopes.scopeFor(Iterables.<VariableDeclaration>filter(((SelfCheckoutInstore)context).getStatement(), VariableDeclaration.class));
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
