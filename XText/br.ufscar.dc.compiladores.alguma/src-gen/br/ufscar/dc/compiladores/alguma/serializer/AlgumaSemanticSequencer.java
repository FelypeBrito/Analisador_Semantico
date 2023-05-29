/*
 * generated by Xtext 2.31.0.M3
 */
package br.ufscar.dc.compiladores.alguma.serializer;

import br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage;
import br.ufscar.dc.compiladores.alguma.alguma.ComandoAtribuicao;
import br.ufscar.dc.compiladores.alguma.alguma.ComandoCondicao;
import br.ufscar.dc.compiladores.alguma.alguma.ComandoEntrada;
import br.ufscar.dc.compiladores.alguma.alguma.ComandoRepeticao;
import br.ufscar.dc.compiladores.alguma.alguma.ComandoSaida;
import br.ufscar.dc.compiladores.alguma.alguma.Declaracao;
import br.ufscar.dc.compiladores.alguma.alguma.ExpressaoAritmetica;
import br.ufscar.dc.compiladores.alguma.alguma.ExpressaoRelacional;
import br.ufscar.dc.compiladores.alguma.alguma.FatorNumero;
import br.ufscar.dc.compiladores.alguma.alguma.FatorSubExpressao;
import br.ufscar.dc.compiladores.alguma.alguma.FatorVariavel;
import br.ufscar.dc.compiladores.alguma.alguma.OutroFatorAritmetico;
import br.ufscar.dc.compiladores.alguma.alguma.OutroTermoAritmetico;
import br.ufscar.dc.compiladores.alguma.alguma.OutroTermoRelacional;
import br.ufscar.dc.compiladores.alguma.alguma.Programa;
import br.ufscar.dc.compiladores.alguma.alguma.SubAlgoritmo;
import br.ufscar.dc.compiladores.alguma.alguma.TermoAritmetico;
import br.ufscar.dc.compiladores.alguma.alguma.TermoComparacaoRelacional;
import br.ufscar.dc.compiladores.alguma.alguma.TermoSubExpressaoRelacional;
import br.ufscar.dc.compiladores.alguma.services.AlgumaGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AlgumaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AlgumaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AlgumaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AlgumaPackage.COMANDO_ATRIBUICAO:
				sequence_ComandoAtribuicao(context, (ComandoAtribuicao) semanticObject); 
				return; 
			case AlgumaPackage.COMANDO_CONDICAO:
				sequence_ComandoCondicao(context, (ComandoCondicao) semanticObject); 
				return; 
			case AlgumaPackage.COMANDO_ENTRADA:
				sequence_ComandoEntrada(context, (ComandoEntrada) semanticObject); 
				return; 
			case AlgumaPackage.COMANDO_REPETICAO:
				sequence_ComandoRepeticao(context, (ComandoRepeticao) semanticObject); 
				return; 
			case AlgumaPackage.COMANDO_SAIDA:
				sequence_ComandoSaida(context, (ComandoSaida) semanticObject); 
				return; 
			case AlgumaPackage.DECLARACAO:
				sequence_Declaracao(context, (Declaracao) semanticObject); 
				return; 
			case AlgumaPackage.EXPRESSAO_ARITMETICA:
				sequence_ExpressaoAritmetica(context, (ExpressaoAritmetica) semanticObject); 
				return; 
			case AlgumaPackage.EXPRESSAO_RELACIONAL:
				sequence_ExpressaoRelacional(context, (ExpressaoRelacional) semanticObject); 
				return; 
			case AlgumaPackage.FATOR_NUMERO:
				sequence_FatorNumero(context, (FatorNumero) semanticObject); 
				return; 
			case AlgumaPackage.FATOR_SUB_EXPRESSAO:
				sequence_FatorSubExpressao(context, (FatorSubExpressao) semanticObject); 
				return; 
			case AlgumaPackage.FATOR_VARIAVEL:
				sequence_FatorVariavel(context, (FatorVariavel) semanticObject); 
				return; 
			case AlgumaPackage.OUTRO_FATOR_ARITMETICO:
				sequence_OutroFatorAritmetico(context, (OutroFatorAritmetico) semanticObject); 
				return; 
			case AlgumaPackage.OUTRO_TERMO_ARITMETICO:
				sequence_OutroTermoAritmetico(context, (OutroTermoAritmetico) semanticObject); 
				return; 
			case AlgumaPackage.OUTRO_TERMO_RELACIONAL:
				sequence_OutroTermoRelacional(context, (OutroTermoRelacional) semanticObject); 
				return; 
			case AlgumaPackage.PROGRAMA:
				sequence_Programa(context, (Programa) semanticObject); 
				return; 
			case AlgumaPackage.SUB_ALGORITMO:
				sequence_SubAlgoritmo(context, (SubAlgoritmo) semanticObject); 
				return; 
			case AlgumaPackage.TERMO_ARITMETICO:
				sequence_TermoAritmetico(context, (TermoAritmetico) semanticObject); 
				return; 
			case AlgumaPackage.TERMO_COMPARACAO_RELACIONAL:
				sequence_TermoComparacaoRelacional(context, (TermoComparacaoRelacional) semanticObject); 
				return; 
			case AlgumaPackage.TERMO_SUB_EXPRESSAO_RELACIONAL:
				sequence_TermoSubExpressaoRelacional(context, (TermoSubExpressaoRelacional) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Comando returns ComandoAtribuicao
	 *     ComandoAtribuicao returns ComandoAtribuicao
	 *
	 * Constraint:
	 *     (exp=ExpressaoAritmetica variavel=[Declaracao|ID])
	 * </pre>
	 */
	protected void sequence_ComandoAtribuicao(ISerializationContext context, ComandoAtribuicao semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.COMANDO_ATRIBUICAO__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.COMANDO_ATRIBUICAO__EXP));
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.COMANDO_ATRIBUICAO__VARIAVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.COMANDO_ATRIBUICAO__VARIAVEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComandoAtribuicaoAccess().getExpExpressaoAritmeticaParserRuleCall_1_0(), semanticObject.getExp());
		feeder.accept(grammarAccess.getComandoAtribuicaoAccess().getVariavelDeclaracaoIDTerminalRuleCall_3_0_1(), semanticObject.eGet(AlgumaPackage.Literals.COMANDO_ATRIBUICAO__VARIAVEL, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Comando returns ComandoCondicao
	 *     ComandoCondicao returns ComandoCondicao
	 *
	 * Constraint:
	 *     (exp=ExpressaoRelacional cmd1=Comando cmd2=Comando?)
	 * </pre>
	 */
	protected void sequence_ComandoCondicao(ISerializationContext context, ComandoCondicao semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Comando returns ComandoEntrada
	 *     ComandoEntrada returns ComandoEntrada
	 *
	 * Constraint:
	 *     variavel=[Declaracao|ID]
	 * </pre>
	 */
	protected void sequence_ComandoEntrada(ISerializationContext context, ComandoEntrada semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.COMANDO_ENTRADA__VARIAVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.COMANDO_ENTRADA__VARIAVEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComandoEntradaAccess().getVariavelDeclaracaoIDTerminalRuleCall_1_0_1(), semanticObject.eGet(AlgumaPackage.Literals.COMANDO_ENTRADA__VARIAVEL, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Comando returns ComandoRepeticao
	 *     ComandoRepeticao returns ComandoRepeticao
	 *
	 * Constraint:
	 *     (exp=ExpressaoRelacional cmd=Comando)
	 * </pre>
	 */
	protected void sequence_ComandoRepeticao(ISerializationContext context, ComandoRepeticao semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.COMANDO_REPETICAO__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.COMANDO_REPETICAO__EXP));
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.COMANDO_REPETICAO__CMD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.COMANDO_REPETICAO__CMD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComandoRepeticaoAccess().getExpExpressaoRelacionalParserRuleCall_1_0(), semanticObject.getExp());
		feeder.accept(grammarAccess.getComandoRepeticaoAccess().getCmdComandoParserRuleCall_2_0(), semanticObject.getCmd());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Comando returns ComandoSaida
	 *     ComandoSaida returns ComandoSaida
	 *
	 * Constraint:
	 *     variavel=[Declaracao|ID]
	 * </pre>
	 */
	protected void sequence_ComandoSaida(ISerializationContext context, ComandoSaida semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.COMANDO_SAIDA__VARIAVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.COMANDO_SAIDA__VARIAVEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComandoSaidaAccess().getVariavelDeclaracaoIDTerminalRuleCall_1_0_1(), semanticObject.eGet(AlgumaPackage.Literals.COMANDO_SAIDA__VARIAVEL, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Declaracao returns Declaracao
	 *
	 * Constraint:
	 *     (name=ID tipo=TipoVar)
	 * </pre>
	 */
	protected void sequence_Declaracao(ISerializationContext context, Declaracao semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.DECLARACAO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.DECLARACAO__NAME));
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.DECLARACAO__TIPO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.DECLARACAO__TIPO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeclaracaoAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDeclaracaoAccess().getTipoTipoVarParserRuleCall_2_0(), semanticObject.getTipo());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ExpressaoAritmetica returns ExpressaoAritmetica
	 *
	 * Constraint:
	 *     (termo1=TermoAritmetico outrosTermos+=OutroTermoAritmetico*)
	 * </pre>
	 */
	protected void sequence_ExpressaoAritmetica(ISerializationContext context, ExpressaoAritmetica semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ExpressaoRelacional returns ExpressaoRelacional
	 *
	 * Constraint:
	 *     (termo1=TermoRelacional outrosTermos+=OutroTermoRelacional*)
	 * </pre>
	 */
	protected void sequence_ExpressaoRelacional(ISerializationContext context, ExpressaoRelacional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FatorAritmetico returns FatorNumero
	 *     FatorNumero returns FatorNumero
	 *
	 * Constraint:
	 *     numero=INT
	 * </pre>
	 */
	protected void sequence_FatorNumero(ISerializationContext context, FatorNumero semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.FATOR_NUMERO__NUMERO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.FATOR_NUMERO__NUMERO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFatorNumeroAccess().getNumeroINTTerminalRuleCall_0(), semanticObject.getNumero());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FatorAritmetico returns FatorSubExpressao
	 *     FatorSubExpressao returns FatorSubExpressao
	 *
	 * Constraint:
	 *     expressao=ExpressaoAritmetica
	 * </pre>
	 */
	protected void sequence_FatorSubExpressao(ISerializationContext context, FatorSubExpressao semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.FATOR_SUB_EXPRESSAO__EXPRESSAO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.FATOR_SUB_EXPRESSAO__EXPRESSAO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFatorSubExpressaoAccess().getExpressaoExpressaoAritmeticaParserRuleCall_1_0(), semanticObject.getExpressao());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FatorAritmetico returns FatorVariavel
	 *     FatorVariavel returns FatorVariavel
	 *
	 * Constraint:
	 *     variavel=[Declaracao|ID]
	 * </pre>
	 */
	protected void sequence_FatorVariavel(ISerializationContext context, FatorVariavel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.FATOR_VARIAVEL__VARIAVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.FATOR_VARIAVEL__VARIAVEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFatorVariavelAccess().getVariavelDeclaracaoIDTerminalRuleCall_0_1(), semanticObject.eGet(AlgumaPackage.Literals.FATOR_VARIAVEL__VARIAVEL, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OutroFatorAritmetico returns OutroFatorAritmetico
	 *
	 * Constraint:
	 *     (operador=OpArit2 fator=FatorAritmetico)
	 * </pre>
	 */
	protected void sequence_OutroFatorAritmetico(ISerializationContext context, OutroFatorAritmetico semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.OUTRO_FATOR_ARITMETICO__OPERADOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.OUTRO_FATOR_ARITMETICO__OPERADOR));
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.OUTRO_FATOR_ARITMETICO__FATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.OUTRO_FATOR_ARITMETICO__FATOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOutroFatorAritmeticoAccess().getOperadorOpArit2ParserRuleCall_0_0(), semanticObject.getOperador());
		feeder.accept(grammarAccess.getOutroFatorAritmeticoAccess().getFatorFatorAritmeticoParserRuleCall_1_0(), semanticObject.getFator());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OutroTermoAritmetico returns OutroTermoAritmetico
	 *
	 * Constraint:
	 *     (operador=OpArit1 termo=TermoAritmetico)
	 * </pre>
	 */
	protected void sequence_OutroTermoAritmetico(ISerializationContext context, OutroTermoAritmetico semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.OUTRO_TERMO_ARITMETICO__OPERADOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.OUTRO_TERMO_ARITMETICO__OPERADOR));
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.OUTRO_TERMO_ARITMETICO__TERMO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.OUTRO_TERMO_ARITMETICO__TERMO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOutroTermoAritmeticoAccess().getOperadorOpArit1ParserRuleCall_0_0(), semanticObject.getOperador());
		feeder.accept(grammarAccess.getOutroTermoAritmeticoAccess().getTermoTermoAritmeticoParserRuleCall_1_0(), semanticObject.getTermo());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OutroTermoRelacional returns OutroTermoRelacional
	 *
	 * Constraint:
	 *     (operador=OpBool termo=TermoRelacional)
	 * </pre>
	 */
	protected void sequence_OutroTermoRelacional(ISerializationContext context, OutroTermoRelacional semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.OUTRO_TERMO_RELACIONAL__OPERADOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.OUTRO_TERMO_RELACIONAL__OPERADOR));
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.OUTRO_TERMO_RELACIONAL__TERMO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.OUTRO_TERMO_RELACIONAL__TERMO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOutroTermoRelacionalAccess().getOperadorOpBoolParserRuleCall_0_0(), semanticObject.getOperador());
		feeder.accept(grammarAccess.getOutroTermoRelacionalAccess().getTermoTermoRelacionalParserRuleCall_1_0(), semanticObject.getTermo());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Programa returns Programa
	 *
	 * Constraint:
	 *     (declaracoes+=Declaracao+ comandos+=Comando+)
	 * </pre>
	 */
	protected void sequence_Programa(ISerializationContext context, Programa semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Comando returns SubAlgoritmo
	 *     SubAlgoritmo returns SubAlgoritmo
	 *
	 * Constraint:
	 *     comandos+=Comando+
	 * </pre>
	 */
	protected void sequence_SubAlgoritmo(ISerializationContext context, SubAlgoritmo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TermoAritmetico returns TermoAritmetico
	 *
	 * Constraint:
	 *     (fator1=FatorAritmetico outrosFatores+=OutroFatorAritmetico*)
	 * </pre>
	 */
	protected void sequence_TermoAritmetico(ISerializationContext context, TermoAritmetico semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TermoRelacional returns TermoComparacaoRelacional
	 *     TermoComparacaoRelacional returns TermoComparacaoRelacional
	 *
	 * Constraint:
	 *     (exp1=ExpressaoAritmetica opRel=OpRel exp2=ExpressaoAritmetica)
	 * </pre>
	 */
	protected void sequence_TermoComparacaoRelacional(ISerializationContext context, TermoComparacaoRelacional semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.TERMO_COMPARACAO_RELACIONAL__EXP1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.TERMO_COMPARACAO_RELACIONAL__EXP1));
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.TERMO_COMPARACAO_RELACIONAL__OP_REL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.TERMO_COMPARACAO_RELACIONAL__OP_REL));
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.TERMO_COMPARACAO_RELACIONAL__EXP2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.TERMO_COMPARACAO_RELACIONAL__EXP2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTermoComparacaoRelacionalAccess().getExp1ExpressaoAritmeticaParserRuleCall_0_0(), semanticObject.getExp1());
		feeder.accept(grammarAccess.getTermoComparacaoRelacionalAccess().getOpRelOpRelParserRuleCall_1_0(), semanticObject.getOpRel());
		feeder.accept(grammarAccess.getTermoComparacaoRelacionalAccess().getExp2ExpressaoAritmeticaParserRuleCall_2_0(), semanticObject.getExp2());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TermoRelacional returns TermoSubExpressaoRelacional
	 *     TermoSubExpressaoRelacional returns TermoSubExpressaoRelacional
	 *
	 * Constraint:
	 *     expRel=ExpressaoRelacional
	 * </pre>
	 */
	protected void sequence_TermoSubExpressaoRelacional(ISerializationContext context, TermoSubExpressaoRelacional semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AlgumaPackage.Literals.TERMO_SUB_EXPRESSAO_RELACIONAL__EXP_REL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlgumaPackage.Literals.TERMO_SUB_EXPRESSAO_RELACIONAL__EXP_REL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTermoSubExpressaoRelacionalAccess().getExpRelExpressaoRelacionalParserRuleCall_1_0(), semanticObject.getExpRel());
		feeder.finish();
	}
	
	
}
