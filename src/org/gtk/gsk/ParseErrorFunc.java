package org.gtk.gsk;

@FunctionalInterface
public interface ParseErrorFunc {

    /**
     * Type of callback that is called when an error occurs
     * during node deserialization.
     */
    public void onParseErrorFunc(ParseLocation start, ParseLocation end, org.gtk.glib.Error error, jdk.incubator.foreign.MemoryAddress userData);
}
