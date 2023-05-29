/**
 * generated by Xtext 2.31.0.M3
 */
package br.ufscar.dc.compiladores.alguma.alguma.impl;

import br.ufscar.dc.compiladores.alguma.alguma.AlgumaFactory;
import br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage;
import br.ufscar.dc.compiladores.alguma.alguma.Comando;
import br.ufscar.dc.compiladores.alguma.alguma.ComandoAtribuicao;
import br.ufscar.dc.compiladores.alguma.alguma.ComandoCondicao;
import br.ufscar.dc.compiladores.alguma.alguma.ComandoEntrada;
import br.ufscar.dc.compiladores.alguma.alguma.ComandoRepeticao;
import br.ufscar.dc.compiladores.alguma.alguma.ComandoSaida;
import br.ufscar.dc.compiladores.alguma.alguma.Declaracao;
import br.ufscar.dc.compiladores.alguma.alguma.ExpressaoAritmetica;
import br.ufscar.dc.compiladores.alguma.alguma.ExpressaoRelacional;
import br.ufscar.dc.compiladores.alguma.alguma.FatorAritmetico;
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
import br.ufscar.dc.compiladores.alguma.alguma.TermoRelacional;
import br.ufscar.dc.compiladores.alguma.alguma.TermoSubExpressaoRelacional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgumaPackageImpl extends EPackageImpl implements AlgumaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declaracaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressaoAritmeticaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outroTermoAritmeticoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termoAritmeticoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outroFatorAritmeticoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fatorAritmeticoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fatorNumeroEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fatorVariavelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fatorSubExpressaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressaoRelacionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outroTermoRelacionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termoRelacionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termoComparacaoRelacionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termoSubExpressaoRelacionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comandoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comandoAtribuicaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comandoEntradaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comandoSaidaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comandoCondicaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comandoRepeticaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subAlgoritmoEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AlgumaPackageImpl()
  {
    super(eNS_URI, AlgumaFactory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link AlgumaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AlgumaPackage init()
  {
    if (isInited) return (AlgumaPackage)EPackage.Registry.INSTANCE.getEPackage(AlgumaPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredAlgumaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    AlgumaPackageImpl theAlgumaPackage = registeredAlgumaPackage instanceof AlgumaPackageImpl ? (AlgumaPackageImpl)registeredAlgumaPackage : new AlgumaPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theAlgumaPackage.createPackageContents();

    // Initialize created meta-data
    theAlgumaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAlgumaPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AlgumaPackage.eNS_URI, theAlgumaPackage);
    return theAlgumaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPrograma()
  {
    return programaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPrograma_Declaracoes()
  {
    return (EReference)programaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPrograma_Comandos()
  {
    return (EReference)programaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDeclaracao()
  {
    return declaracaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDeclaracao_Name()
  {
    return (EAttribute)declaracaoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDeclaracao_Tipo()
  {
    return (EAttribute)declaracaoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressaoAritmetica()
  {
    return expressaoAritmeticaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressaoAritmetica_Termo1()
  {
    return (EReference)expressaoAritmeticaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressaoAritmetica_OutrosTermos()
  {
    return (EReference)expressaoAritmeticaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOutroTermoAritmetico()
  {
    return outroTermoAritmeticoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOutroTermoAritmetico_Operador()
  {
    return (EAttribute)outroTermoAritmeticoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOutroTermoAritmetico_Termo()
  {
    return (EReference)outroTermoAritmeticoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTermoAritmetico()
  {
    return termoAritmeticoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTermoAritmetico_Fator1()
  {
    return (EReference)termoAritmeticoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTermoAritmetico_OutrosFatores()
  {
    return (EReference)termoAritmeticoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOutroFatorAritmetico()
  {
    return outroFatorAritmeticoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOutroFatorAritmetico_Operador()
  {
    return (EAttribute)outroFatorAritmeticoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOutroFatorAritmetico_Fator()
  {
    return (EReference)outroFatorAritmeticoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFatorAritmetico()
  {
    return fatorAritmeticoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFatorNumero()
  {
    return fatorNumeroEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFatorNumero_Numero()
  {
    return (EAttribute)fatorNumeroEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFatorVariavel()
  {
    return fatorVariavelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFatorVariavel_Variavel()
  {
    return (EReference)fatorVariavelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFatorSubExpressao()
  {
    return fatorSubExpressaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFatorSubExpressao_Expressao()
  {
    return (EReference)fatorSubExpressaoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressaoRelacional()
  {
    return expressaoRelacionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressaoRelacional_Termo1()
  {
    return (EReference)expressaoRelacionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExpressaoRelacional_OutrosTermos()
  {
    return (EReference)expressaoRelacionalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOutroTermoRelacional()
  {
    return outroTermoRelacionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOutroTermoRelacional_Operador()
  {
    return (EAttribute)outroTermoRelacionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOutroTermoRelacional_Termo()
  {
    return (EReference)outroTermoRelacionalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTermoRelacional()
  {
    return termoRelacionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTermoComparacaoRelacional()
  {
    return termoComparacaoRelacionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTermoComparacaoRelacional_Exp1()
  {
    return (EReference)termoComparacaoRelacionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTermoComparacaoRelacional_OpRel()
  {
    return (EAttribute)termoComparacaoRelacionalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTermoComparacaoRelacional_Exp2()
  {
    return (EReference)termoComparacaoRelacionalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTermoSubExpressaoRelacional()
  {
    return termoSubExpressaoRelacionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTermoSubExpressaoRelacional_ExpRel()
  {
    return (EReference)termoSubExpressaoRelacionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComando()
  {
    return comandoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComandoAtribuicao()
  {
    return comandoAtribuicaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComandoAtribuicao_Exp()
  {
    return (EReference)comandoAtribuicaoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComandoAtribuicao_Variavel()
  {
    return (EReference)comandoAtribuicaoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComandoEntrada()
  {
    return comandoEntradaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComandoEntrada_Variavel()
  {
    return (EReference)comandoEntradaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComandoSaida()
  {
    return comandoSaidaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComandoSaida_Variavel()
  {
    return (EReference)comandoSaidaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComandoCondicao()
  {
    return comandoCondicaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComandoCondicao_Exp()
  {
    return (EReference)comandoCondicaoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComandoCondicao_Cmd1()
  {
    return (EReference)comandoCondicaoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComandoCondicao_Cmd2()
  {
    return (EReference)comandoCondicaoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComandoRepeticao()
  {
    return comandoRepeticaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComandoRepeticao_Exp()
  {
    return (EReference)comandoRepeticaoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getComandoRepeticao_Cmd()
  {
    return (EReference)comandoRepeticaoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSubAlgoritmo()
  {
    return subAlgoritmoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSubAlgoritmo_Comandos()
  {
    return (EReference)subAlgoritmoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AlgumaFactory getAlgumaFactory()
  {
    return (AlgumaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    programaEClass = createEClass(PROGRAMA);
    createEReference(programaEClass, PROGRAMA__DECLARACOES);
    createEReference(programaEClass, PROGRAMA__COMANDOS);

    declaracaoEClass = createEClass(DECLARACAO);
    createEAttribute(declaracaoEClass, DECLARACAO__NAME);
    createEAttribute(declaracaoEClass, DECLARACAO__TIPO);

    expressaoAritmeticaEClass = createEClass(EXPRESSAO_ARITMETICA);
    createEReference(expressaoAritmeticaEClass, EXPRESSAO_ARITMETICA__TERMO1);
    createEReference(expressaoAritmeticaEClass, EXPRESSAO_ARITMETICA__OUTROS_TERMOS);

    outroTermoAritmeticoEClass = createEClass(OUTRO_TERMO_ARITMETICO);
    createEAttribute(outroTermoAritmeticoEClass, OUTRO_TERMO_ARITMETICO__OPERADOR);
    createEReference(outroTermoAritmeticoEClass, OUTRO_TERMO_ARITMETICO__TERMO);

    termoAritmeticoEClass = createEClass(TERMO_ARITMETICO);
    createEReference(termoAritmeticoEClass, TERMO_ARITMETICO__FATOR1);
    createEReference(termoAritmeticoEClass, TERMO_ARITMETICO__OUTROS_FATORES);

    outroFatorAritmeticoEClass = createEClass(OUTRO_FATOR_ARITMETICO);
    createEAttribute(outroFatorAritmeticoEClass, OUTRO_FATOR_ARITMETICO__OPERADOR);
    createEReference(outroFatorAritmeticoEClass, OUTRO_FATOR_ARITMETICO__FATOR);

    fatorAritmeticoEClass = createEClass(FATOR_ARITMETICO);

    fatorNumeroEClass = createEClass(FATOR_NUMERO);
    createEAttribute(fatorNumeroEClass, FATOR_NUMERO__NUMERO);

    fatorVariavelEClass = createEClass(FATOR_VARIAVEL);
    createEReference(fatorVariavelEClass, FATOR_VARIAVEL__VARIAVEL);

    fatorSubExpressaoEClass = createEClass(FATOR_SUB_EXPRESSAO);
    createEReference(fatorSubExpressaoEClass, FATOR_SUB_EXPRESSAO__EXPRESSAO);

    expressaoRelacionalEClass = createEClass(EXPRESSAO_RELACIONAL);
    createEReference(expressaoRelacionalEClass, EXPRESSAO_RELACIONAL__TERMO1);
    createEReference(expressaoRelacionalEClass, EXPRESSAO_RELACIONAL__OUTROS_TERMOS);

    outroTermoRelacionalEClass = createEClass(OUTRO_TERMO_RELACIONAL);
    createEAttribute(outroTermoRelacionalEClass, OUTRO_TERMO_RELACIONAL__OPERADOR);
    createEReference(outroTermoRelacionalEClass, OUTRO_TERMO_RELACIONAL__TERMO);

    termoRelacionalEClass = createEClass(TERMO_RELACIONAL);

    termoComparacaoRelacionalEClass = createEClass(TERMO_COMPARACAO_RELACIONAL);
    createEReference(termoComparacaoRelacionalEClass, TERMO_COMPARACAO_RELACIONAL__EXP1);
    createEAttribute(termoComparacaoRelacionalEClass, TERMO_COMPARACAO_RELACIONAL__OP_REL);
    createEReference(termoComparacaoRelacionalEClass, TERMO_COMPARACAO_RELACIONAL__EXP2);

    termoSubExpressaoRelacionalEClass = createEClass(TERMO_SUB_EXPRESSAO_RELACIONAL);
    createEReference(termoSubExpressaoRelacionalEClass, TERMO_SUB_EXPRESSAO_RELACIONAL__EXP_REL);

    comandoEClass = createEClass(COMANDO);

    comandoAtribuicaoEClass = createEClass(COMANDO_ATRIBUICAO);
    createEReference(comandoAtribuicaoEClass, COMANDO_ATRIBUICAO__EXP);
    createEReference(comandoAtribuicaoEClass, COMANDO_ATRIBUICAO__VARIAVEL);

    comandoEntradaEClass = createEClass(COMANDO_ENTRADA);
    createEReference(comandoEntradaEClass, COMANDO_ENTRADA__VARIAVEL);

    comandoSaidaEClass = createEClass(COMANDO_SAIDA);
    createEReference(comandoSaidaEClass, COMANDO_SAIDA__VARIAVEL);

    comandoCondicaoEClass = createEClass(COMANDO_CONDICAO);
    createEReference(comandoCondicaoEClass, COMANDO_CONDICAO__EXP);
    createEReference(comandoCondicaoEClass, COMANDO_CONDICAO__CMD1);
    createEReference(comandoCondicaoEClass, COMANDO_CONDICAO__CMD2);

    comandoRepeticaoEClass = createEClass(COMANDO_REPETICAO);
    createEReference(comandoRepeticaoEClass, COMANDO_REPETICAO__EXP);
    createEReference(comandoRepeticaoEClass, COMANDO_REPETICAO__CMD);

    subAlgoritmoEClass = createEClass(SUB_ALGORITMO);
    createEReference(subAlgoritmoEClass, SUB_ALGORITMO__COMANDOS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    fatorNumeroEClass.getESuperTypes().add(this.getFatorAritmetico());
    fatorVariavelEClass.getESuperTypes().add(this.getFatorAritmetico());
    fatorSubExpressaoEClass.getESuperTypes().add(this.getFatorAritmetico());
    termoComparacaoRelacionalEClass.getESuperTypes().add(this.getTermoRelacional());
    termoSubExpressaoRelacionalEClass.getESuperTypes().add(this.getTermoRelacional());
    comandoAtribuicaoEClass.getESuperTypes().add(this.getComando());
    comandoEntradaEClass.getESuperTypes().add(this.getComando());
    comandoSaidaEClass.getESuperTypes().add(this.getComando());
    comandoCondicaoEClass.getESuperTypes().add(this.getComando());
    comandoRepeticaoEClass.getESuperTypes().add(this.getComando());
    subAlgoritmoEClass.getESuperTypes().add(this.getComando());

    // Initialize classes and features; add operations and parameters
    initEClass(programaEClass, Programa.class, "Programa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrograma_Declaracoes(), this.getDeclaracao(), null, "declaracoes", null, 0, -1, Programa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrograma_Comandos(), this.getComando(), null, "comandos", null, 0, -1, Programa.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declaracaoEClass, Declaracao.class, "Declaracao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeclaracao_Name(), ecorePackage.getEString(), "name", null, 0, 1, Declaracao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeclaracao_Tipo(), ecorePackage.getEString(), "tipo", null, 0, 1, Declaracao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressaoAritmeticaEClass, ExpressaoAritmetica.class, "ExpressaoAritmetica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressaoAritmetica_Termo1(), this.getTermoAritmetico(), null, "termo1", null, 0, 1, ExpressaoAritmetica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressaoAritmetica_OutrosTermos(), this.getOutroTermoAritmetico(), null, "outrosTermos", null, 0, -1, ExpressaoAritmetica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outroTermoAritmeticoEClass, OutroTermoAritmetico.class, "OutroTermoAritmetico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutroTermoAritmetico_Operador(), ecorePackage.getEString(), "operador", null, 0, 1, OutroTermoAritmetico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutroTermoAritmetico_Termo(), this.getTermoAritmetico(), null, "termo", null, 0, 1, OutroTermoAritmetico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termoAritmeticoEClass, TermoAritmetico.class, "TermoAritmetico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTermoAritmetico_Fator1(), this.getFatorAritmetico(), null, "fator1", null, 0, 1, TermoAritmetico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTermoAritmetico_OutrosFatores(), this.getOutroFatorAritmetico(), null, "outrosFatores", null, 0, -1, TermoAritmetico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outroFatorAritmeticoEClass, OutroFatorAritmetico.class, "OutroFatorAritmetico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutroFatorAritmetico_Operador(), ecorePackage.getEString(), "operador", null, 0, 1, OutroFatorAritmetico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutroFatorAritmetico_Fator(), this.getFatorAritmetico(), null, "fator", null, 0, 1, OutroFatorAritmetico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fatorAritmeticoEClass, FatorAritmetico.class, "FatorAritmetico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fatorNumeroEClass, FatorNumero.class, "FatorNumero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFatorNumero_Numero(), ecorePackage.getEInt(), "numero", null, 0, 1, FatorNumero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fatorVariavelEClass, FatorVariavel.class, "FatorVariavel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFatorVariavel_Variavel(), this.getDeclaracao(), null, "variavel", null, 0, 1, FatorVariavel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fatorSubExpressaoEClass, FatorSubExpressao.class, "FatorSubExpressao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFatorSubExpressao_Expressao(), this.getExpressaoAritmetica(), null, "expressao", null, 0, 1, FatorSubExpressao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressaoRelacionalEClass, ExpressaoRelacional.class, "ExpressaoRelacional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressaoRelacional_Termo1(), this.getTermoRelacional(), null, "termo1", null, 0, 1, ExpressaoRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressaoRelacional_OutrosTermos(), this.getOutroTermoRelacional(), null, "outrosTermos", null, 0, -1, ExpressaoRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outroTermoRelacionalEClass, OutroTermoRelacional.class, "OutroTermoRelacional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutroTermoRelacional_Operador(), ecorePackage.getEString(), "operador", null, 0, 1, OutroTermoRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutroTermoRelacional_Termo(), this.getTermoRelacional(), null, "termo", null, 0, 1, OutroTermoRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termoRelacionalEClass, TermoRelacional.class, "TermoRelacional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(termoComparacaoRelacionalEClass, TermoComparacaoRelacional.class, "TermoComparacaoRelacional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTermoComparacaoRelacional_Exp1(), this.getExpressaoAritmetica(), null, "exp1", null, 0, 1, TermoComparacaoRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTermoComparacaoRelacional_OpRel(), ecorePackage.getEString(), "opRel", null, 0, 1, TermoComparacaoRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTermoComparacaoRelacional_Exp2(), this.getExpressaoAritmetica(), null, "exp2", null, 0, 1, TermoComparacaoRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termoSubExpressaoRelacionalEClass, TermoSubExpressaoRelacional.class, "TermoSubExpressaoRelacional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTermoSubExpressaoRelacional_ExpRel(), this.getExpressaoRelacional(), null, "expRel", null, 0, 1, TermoSubExpressaoRelacional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comandoEClass, Comando.class, "Comando", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(comandoAtribuicaoEClass, ComandoAtribuicao.class, "ComandoAtribuicao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComandoAtribuicao_Exp(), this.getExpressaoAritmetica(), null, "exp", null, 0, 1, ComandoAtribuicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComandoAtribuicao_Variavel(), this.getDeclaracao(), null, "variavel", null, 0, 1, ComandoAtribuicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comandoEntradaEClass, ComandoEntrada.class, "ComandoEntrada", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComandoEntrada_Variavel(), this.getDeclaracao(), null, "variavel", null, 0, 1, ComandoEntrada.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comandoSaidaEClass, ComandoSaida.class, "ComandoSaida", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComandoSaida_Variavel(), this.getDeclaracao(), null, "variavel", null, 0, 1, ComandoSaida.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comandoCondicaoEClass, ComandoCondicao.class, "ComandoCondicao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComandoCondicao_Exp(), this.getExpressaoRelacional(), null, "exp", null, 0, 1, ComandoCondicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComandoCondicao_Cmd1(), this.getComando(), null, "cmd1", null, 0, 1, ComandoCondicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComandoCondicao_Cmd2(), this.getComando(), null, "cmd2", null, 0, 1, ComandoCondicao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comandoRepeticaoEClass, ComandoRepeticao.class, "ComandoRepeticao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComandoRepeticao_Exp(), this.getExpressaoRelacional(), null, "exp", null, 0, 1, ComandoRepeticao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComandoRepeticao_Cmd(), this.getComando(), null, "cmd", null, 0, 1, ComandoRepeticao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subAlgoritmoEClass, SubAlgoritmo.class, "SubAlgoritmo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubAlgoritmo_Comandos(), this.getComando(), null, "comandos", null, 0, -1, SubAlgoritmo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //AlgumaPackageImpl
