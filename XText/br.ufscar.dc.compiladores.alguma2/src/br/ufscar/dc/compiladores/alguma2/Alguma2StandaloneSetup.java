/*
 * generated by Xtext 2.31.0.M3
 */
package br.ufscar.dc.compiladores.alguma2;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class Alguma2StandaloneSetup extends Alguma2StandaloneSetupGenerated {

	public static void doSetup() {
		new Alguma2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
