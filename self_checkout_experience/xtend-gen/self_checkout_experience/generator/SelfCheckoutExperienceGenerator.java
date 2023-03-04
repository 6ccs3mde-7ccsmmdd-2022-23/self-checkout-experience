/**
 * generated by Xtext 2.25.0
 */
package self_checkout_experience.generator;

import com.google.common.collect.Iterators;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
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
import self_checkout_experience.selfCheckoutExperience.Drop;
import self_checkout_experience.selfCheckoutExperience.HoldSelfScanner;
import self_checkout_experience.selfCheckoutExperience.IntExpression;
import self_checkout_experience.selfCheckoutExperience.IntLiteral;
import self_checkout_experience.selfCheckoutExperience.IntVarExpression;
import self_checkout_experience.selfCheckoutExperience.MoveStatement;
import self_checkout_experience.selfCheckoutExperience.Multiplication;
import self_checkout_experience.selfCheckoutExperience.Pay;
import self_checkout_experience.selfCheckoutExperience.PickStatement;
import self_checkout_experience.selfCheckoutExperience.RemoveFromOnlineBasket;
import self_checkout_experience.selfCheckoutExperience.Repeat;
import self_checkout_experience.selfCheckoutExperience.Scan;
import self_checkout_experience.selfCheckoutExperience.ScanAndAddToBasket;
import self_checkout_experience.selfCheckoutExperience.ScanExpression;
import self_checkout_experience.selfCheckoutExperience.Search;
import self_checkout_experience.selfCheckoutExperience.SelfCheckoutInstore;
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
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Self_checkout model = ((Self_checkout) _head);
    fsa.generateFile("self_checkout_experience.txt", this.generate(model));
  }
  
  public CharSequence doGenerateClass(final Self_checkout program, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import self_checkout_experience.*;");
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
    _builder.append("SelfCheckoutFrame scf = new SelfCheckoutFrame();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Self_checkout sc = new Self_checkout(scf) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void run() {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    final Function1<SelfCheckoutInstore, String> _function = (SelfCheckoutInstore it) -> {
      SelfCheckoutExperienceGenerator.Environment _environment = new SelfCheckoutExperienceGenerator.Environment();
      return this.generateJavaStatement(_environment);
    };
    String _join = IterableExtensions.join(ListExtensions.<SelfCheckoutInstore, String>map(program.getSelfCheckoutInstore(), _function), "\n");
    _builder.append(_join, "\t\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("sc.run();");
    _builder.newLine();
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
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final HoldSelfScanner sci, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Self Checkout Scanner aquired\");");
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final PickStatement picksmnt, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"");
    String _generateJavaExpression = this.generateJavaExpression(picksmnt.getItemCount());
    _builder.append(_generateJavaExpression);
    _builder.append(" , ");
    String _firstUpper = StringExtensions.toFirstUpper(picksmnt.getItemPicked().getName());
    _builder.append(_firstUpper);
    _builder.append("\");");
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final ScanAndAddToBasket item, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Adding ");
    String _name = item.getItemInBasket().getName();
    _builder.append(_name);
    _builder.append(" in basket\");");
    return _builder.toString();
  }
  
  protected String _generateJavaExpression(final Drop item, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Dropping ");
    String _name = item.getItemDropped().getName();
    _builder.append(_name);
    _builder.append("\");");
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
    _builder.append("(");
    String _generateJavaExpression = this.generateJavaExpression(smnt.getSteps());
    _builder.append(_generateJavaExpression);
    _builder.append("\");");
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
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("System.out.println(\"Entering inside Repeat\"); ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("System.out.println(");
      final Function1<EObject, String> _function = (EObject it) -> {
        return this.generateJavaStatement(env);
      };
      String _join = IterableExtensions.join(ListExtensions.<EObject, String>map(stmt.getStatements(), _function), "\n");
      _builder.append(_join, "\t\t\t");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("System.out.println(\"Existing Repeat\");");
      String repeat = _builder.toString();
      env.exit();
      _xblockexpression = repeat;
    }
    return _xblockexpression;
  }
  
  protected String _generateJavaStatement(final Checkout checkout, final SelfCheckoutExperienceGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Going to checkout\");");
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final ScanExpression se) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final Scan scan) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Load self scanner onto till\");");
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final ComplexScan compscan) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"");
    String _generateJavaStatement = this.generateJavaStatement(compscan.getStart());
    _builder.append(_generateJavaStatement);
    _builder.append("; ");
    final Function1<CarryItems, String> _function = (CarryItems se) -> {
      return this.generateJavaStatement(se);
    };
    String _join = IterableExtensions.join(ListExtensions.<CarryItems, String>map(compscan.getNext(), _function), "; ");
    _builder.append(_join);
    _builder.append("\");");
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final CarryItems carryItems) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"carry in\" ");
    Carry _carry = carryItems.getCarry();
    _builder.append(_carry);
    _builder.append(" );");
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final Pay pay) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(\"Paying\");");
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
  
  public CharSequence generate(final Self_checkout checkout) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Self checkout summary:");
    _builder.newLine();
    _builder.newLine();
    _builder.append("ONLINE");
    _builder.newLine();
    _builder.append("- ");
    int _size = IteratorExtensions.size(Iterators.<Search>filter(checkout.eAllContents(), Search.class));
    _builder.append(_size);
    _builder.append(" search statements");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_1 = IteratorExtensions.size(Iterators.<AddToOnlineBasket>filter(checkout.eAllContents(), AddToOnlineBasket.class));
    _builder.append(_size_1);
    _builder.append(" add to online basket statements");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_2 = IteratorExtensions.size(Iterators.<RemoveFromOnlineBasket>filter(checkout.eAllContents(), RemoveFromOnlineBasket.class));
    _builder.append(_size_2);
    _builder.append(" remove from online basket statements");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("IN STORE ");
    _builder.newLine();
    _builder.append("- ");
    int _size_3 = IteratorExtensions.size(Iterators.<PickStatement>filter(checkout.eAllContents(), PickStatement.class));
    _builder.append(_size_3);
    _builder.append(" pick statements");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_4 = IteratorExtensions.size(Iterators.<ScanAndAddToBasket>filter(checkout.eAllContents(), ScanAndAddToBasket.class));
    _builder.append(_size_4);
    _builder.append(" scan and add to basket statements");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_5 = IteratorExtensions.size(Iterators.<Drop>filter(checkout.eAllContents(), Drop.class));
    _builder.append(_size_5);
    _builder.append(" drop statements");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_6 = IteratorExtensions.size(Iterators.<Checkout>filter(checkout.eAllContents(), Checkout.class));
    _builder.append(_size_6);
    _builder.append(" go to self-checkout statements");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_7 = IteratorExtensions.size(Iterators.<Scan>filter(checkout.eAllContents(), Scan.class));
    _builder.append(_size_7);
    _builder.append(" scan statements");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_8 = IteratorExtensions.size(Iterators.<CarryItems>filter(checkout.eAllContents(), CarryItems.class));
    _builder.append(_size_8);
    _builder.append(" carry item statements");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_9 = IteratorExtensions.size(Iterators.<MoveStatement>filter(checkout.eAllContents(), MoveStatement.class));
    _builder.append(_size_9);
    _builder.append(" move statements");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_10 = IteratorExtensions.size(Iterators.<TurnStatement>filter(checkout.eAllContents(), TurnStatement.class));
    _builder.append(_size_10);
    _builder.append(" turn statements");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_11 = IteratorExtensions.size(Iterators.<Repeat>filter(checkout.eAllContents(), Repeat.class));
    _builder.append(_size_11);
    _builder.append(" repeat statements");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_12 = IteratorExtensions.size(Iterators.<WalkStatement>filter(checkout.eAllContents(), WalkStatement.class));
    _builder.append(_size_12);
    _builder.append(" Walk statements");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String generateJavaStatement(final EObject smnt, final SelfCheckoutExperienceGenerator.Environment env) {
    if (smnt instanceof MoveStatement) {
      return _generateJavaStatement((MoveStatement)smnt, env);
    } else if (smnt instanceof Repeat) {
      return _generateJavaStatement((Repeat)smnt, env);
    } else if (smnt instanceof TurnStatement) {
      return _generateJavaStatement((TurnStatement)smnt, env);
    } else if (smnt instanceof Checkout) {
      return _generateJavaStatement((Checkout)smnt, env);
    } else if (smnt instanceof HoldSelfScanner) {
      return _generateJavaStatement((HoldSelfScanner)smnt, env);
    } else if (smnt instanceof PickStatement) {
      return _generateJavaStatement((PickStatement)smnt, env);
    } else if (smnt instanceof SelfCheckoutInstore) {
      return _generateJavaStatement((SelfCheckoutInstore)smnt, env);
    } else if (smnt instanceof WalkStatement) {
      return _generateJavaStatement((WalkStatement)smnt, env);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(smnt, env).toString());
    }
  }
  
  public String generateJavaExpression(final EObject item, final SelfCheckoutExperienceGenerator.Environment env) {
    if (item instanceof Drop) {
      return _generateJavaExpression((Drop)item, env);
    } else if (item instanceof ScanAndAddToBasket) {
      return _generateJavaExpression((ScanAndAddToBasket)item, env);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(item, env).toString());
    }
  }
  
  public String generateJavaStatement(final Object compscan) {
    if (compscan instanceof ComplexScan) {
      return _generateJavaStatement((ComplexScan)compscan);
    } else if (compscan instanceof Scan) {
      return _generateJavaStatement((Scan)compscan);
    } else if (compscan instanceof CarryItems) {
      return _generateJavaStatement((CarryItems)compscan);
    } else if (compscan instanceof Pay) {
      return _generateJavaStatement((Pay)compscan);
    } else if (compscan instanceof ScanExpression) {
      return _generateJavaStatement((ScanExpression)compscan);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(compscan).toString());
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
