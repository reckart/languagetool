/* LanguageTool, a natural language style checker 
 * Copyright (C) 2007 Daniel Naber (http://www.danielnaber.de)
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
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package de.danielnaber.languagetool.language;

import java.util.Locale;
import java.util.Set;

import de.danielnaber.languagetool.Language;
import de.danielnaber.languagetool.tagging.Tagger;
import de.danielnaber.languagetool.tagging.xx.DemoTagger;

public class Demo extends Language {

  private Tagger tagger = new DemoTagger();

  public Locale getLocale() {
    return new Locale("en");
  }

  public String getName() {
    return "Testlanguage";
  }

  public String getShortName() {
    return "xx";
  }

  public Tagger getTagger() {
    return tagger;
  }

  public Contributor[] getMaintainers() {
    return null;
  }

  public Set<String> getRelevantRuleIDs() {
    return null;
  }

}
