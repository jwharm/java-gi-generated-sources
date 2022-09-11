package org.gtk.glib;

@FunctionalInterface
public interface RegexEvalCallback {

        void onRegexEvalCallback(MatchInfo matchInfo, String result);
}
