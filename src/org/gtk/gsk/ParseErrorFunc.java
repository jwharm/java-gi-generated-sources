package org.gtk.gsk;

@FunctionalInterface
public interface ParseErrorFunc {

        void onParseErrorFunc(ParseLocation start, ParseLocation end, org.gtk.glib.Error error);
}
