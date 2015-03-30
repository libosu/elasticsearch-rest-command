/* Generated By:JJTree: Do not edit this line. AST_Start.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.everdata.parser;

import org.elasticsearch.common.logging.ESLogger;

public class AST_Start extends SimpleNode {
	public AST_Start(int id) {
		super(id);
	}

	public AST_Start(CommandParser p, int id) {
		super(p, id);
	}

	public Node[] getChildren() {
		return this.children;
	}

	static public void dumpWithLogger(ESLogger logger, SimpleNode node, String prefix) {
		
		logger.debug(prefix + node.toString());
		if (node.children != null) {
			for (int i = 0; i < node.children.length; ++i) {
				dumpWithLogger(logger, (SimpleNode) node.children[i], prefix + " ");				
			}
		}
	}

}
/* JavaCC - OriginalChecksum=f51fdb2211e0d07be2426f9234f61f97 (do not edit this line) */
