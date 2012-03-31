package com.hudson.velocityweb.editors.velocity.completion;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;

public class ElseDirective extends AbstractDirective {

    public boolean requiresEnd() {
        return false;
    }

    public boolean isStackScope() {
        return false;
    }

	public List getCompletionProposals (IFile file, int pos, Map addedValues, ClassLoader loader) throws Exception {
		return getCompletionProposals(file, document, pos, addedValues, loader, false);
	}
	
	public String getLabel () {
	    return "else";
	}
	
    public String getImage() {
        return "else";
    }
}