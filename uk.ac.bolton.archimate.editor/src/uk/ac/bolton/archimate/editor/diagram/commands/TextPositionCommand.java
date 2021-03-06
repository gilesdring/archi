/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.editor.diagram.commands;

import uk.ac.bolton.archimate.editor.model.commands.EObjectFeatureCommand;
import uk.ac.bolton.archimate.model.IArchimatePackage;
import uk.ac.bolton.archimate.model.IFontAttribute;


/**
 * Text Alignment Command
 *
 * @author Phillip Beauvoir
 */
public class TextPositionCommand extends EObjectFeatureCommand {
    
    public TextPositionCommand(IFontAttribute object, int value) {
        super(Messages.TextPositionCommand_0, object, IArchimatePackage.Literals.FONT_ATTRIBUTE__TEXT_POSITION, value);
    }
}