/*
 * Russian Pack for SonarQube
 * Copyright (C) 2016 SilverBulleters, LLC
 * mailto:contact AT silverbulleters DOT org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.silverbulleters.sonar.plugins.l10n;

import org.junit.Test;
import org.sonar.test.i18n.I18nMatchers;

import static org.assertj.core.api.Assertions.assertThat;

public class RussianPackPluginTest {

    @Test
    public void noExtensions() throws Exception {
        assertThat(new RussianPackPlugin().getExtensions()).isEmpty();
    }

    @Test
    public void bundles_should_be_up_to_date() {
        I18nMatchers.assertBundlesUpToDate();
    }


}