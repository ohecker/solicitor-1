/**
 * SPDX-License-Identifier: Apache-2.0
 */
package com.devonfw.tools.solicitor.common.webcontent;

/**
 * TODO ohecker: This type ...
 *
 * @author <a href="TODO@sdm.de">TODO</a>
 * @version $Revision$
 */
public interface ContentFactory<C extends Content> {

    C fromString(String string);

}
