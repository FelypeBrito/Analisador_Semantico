/*
 * generated by Xtext 2.31.0.M3
 */
package br.ufscar.dc.compiladores.alguma;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class AlgumaStandaloneSetup extends AlgumaStandaloneSetupGenerated {

	public static void doSetup() {
		new AlgumaStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
