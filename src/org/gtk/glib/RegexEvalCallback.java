package org.gtk.glib;

@FunctionalInterface
public interface RegexEvalCallback {

    /**
     * Specifies the type of the function passed to g_regex_replace_eval().
     * It is called for each occurrence of the pattern in the string passed
     * to g_regex_replace_eval(), and it should append the replacement to
     * @result.
     */
    public boolean onRegexEvalCallback(MatchInfo matchInfo, String result, jdk.incubator.foreign.MemoryAddress userData);
}
