package org.gtk.gsk;

/**
 * Type of callback that is called when an error occurs
 * during node deserialization.
 */
@FunctionalInterface
public interface ParseErrorFunc {
        void onParseErrorFunc(ParseLocation start, ParseLocation end, org.gtk.glib.Error error);
}
