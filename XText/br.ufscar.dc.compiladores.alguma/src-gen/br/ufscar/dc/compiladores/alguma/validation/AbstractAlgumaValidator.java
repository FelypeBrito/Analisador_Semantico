/*
 * generated by Xtext 2.31.0.M3
 */
package br.ufscar.dc.compiladores.alguma.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractAlgumaValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(br.ufscar.dc.compiladores.alguma.alguma.AlgumaPackage.eINSTANCE);
		return result;
	}
}
