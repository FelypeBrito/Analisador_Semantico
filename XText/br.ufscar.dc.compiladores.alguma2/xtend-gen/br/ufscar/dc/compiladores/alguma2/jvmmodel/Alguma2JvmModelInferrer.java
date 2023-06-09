package br.ufscar.dc.compiladores.alguma2.jvmmodel;

import br.ufscar.dc.compiladores.alguma2.alguma2.Declaracao;
import br.ufscar.dc.compiladores.alguma2.alguma2.Programa;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Alguma2JvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;

  protected void _infer(final Programa element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
      EList<Declaracao> _declaracoes = element.getDeclaracoes();
      for (final Declaracao declaracao : _declaracoes) {
        String _tipo = declaracao.getTipo();
        boolean _equals = Objects.equal(_tipo, "INTEIRO");
        if (_equals) {
          EList<JvmMember> _members = it.getMembers();
          final Procedure1<JvmField> _function_1 = (JvmField it_1) -> {
            it_1.setStatic(true);
          };
          JvmField _field = this._jvmTypesBuilder.toField(declaracao, declaracao.getNome(), this._typeReferenceBuilder.typeRef(int.class), _function_1);
          this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
        } else {
          EList<JvmMember> _members_1 = it.getMembers();
          final Procedure1<JvmField> _function_2 = (JvmField it_1) -> {
            it_1.setStatic(true);
          };
          JvmField _field_1 = this._jvmTypesBuilder.toField(declaracao, declaracao.getNome(), this._typeReferenceBuilder.typeRef(double.class), _function_2);
          this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
        }
      }
      EList<JvmMember> _members_2 = it.getMembers();
      final Procedure1<JvmOperation> _function_3 = (JvmOperation it_1) -> {
        it_1.setStatic(true);
        it_1.getParameters().add(this._jvmTypesBuilder.toParameter(element, "args", this._jvmTypesBuilder.addArrayTypeDimension(this._typeReferenceBuilder.typeRef(String.class))));
        this._jvmTypesBuilder.setBody(it_1, element.getAlgoritmo());
      };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(element, "main", this._typeReferenceBuilder.typeRef(void.class), _function_3);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method);
    };
    acceptor.<JvmGenericType>accept(this._jvmTypesBuilder.toClass(element, "Programa2"), _function);
  }

  public void infer(final EObject element, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (element instanceof Programa) {
      _infer((Programa)element, acceptor, isPreIndexingPhase);
      return;
    } else if (element != null) {
      _infer(element, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, acceptor, isPreIndexingPhase).toString());
    }
  }
}
