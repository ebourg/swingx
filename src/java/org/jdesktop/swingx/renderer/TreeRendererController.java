/*
 * $Id$
 *
 * Copyright 2006 Sun Microsystems, Inc., 4150 Network Circle,
 * Santa Clara, California 95054, U.S.A. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 */
package org.jdesktop.swingx.renderer;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTree;

/**
 * A RendererController specialized on JTree. 
 * Subclassed to not install borders.<p>
 * 
 * PENDING: the tricksery with borders is an implementation detail of the 
 * rendering comp - should not ripple to up here. Nevertheless, this 
 * controller is responsible to reset (in case some Highlighter fiddled 
 * with it)
 * 
 * @author Jeanette Winzenburg
 */
public class TreeRendererController<T extends JComponent> 
    extends RendererController<T, JTree> {

    /**
     * @param componentController
     */
    public TreeRendererController(RenderingComponentController<T> componentController) {
        super(componentController);
    }

    @Override
    protected void configureBorder(CellContext<JTree> context) {
        getRendererComponent().setBorder(BorderFactory.createEmptyBorder());
    }

    
    
}
