/*
 * generated by Xtext 2.31.0.M3
 */
package br.ufscar.dc.compiladores.alguma2.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Alguma2AntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("br/ufscar/dc/compiladores/alguma2/parser/antlr/internal/InternalAlguma2.tokens");
	}
}