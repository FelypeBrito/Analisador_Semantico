/*
 * generated by Xtext 2.31.0.M3
 */
package br.ufscar.dc.compiladores.alguma.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AlgumaAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("br/ufscar/dc/compiladores/alguma/parser/antlr/internal/InternalAlguma.tokens");
	}
}
