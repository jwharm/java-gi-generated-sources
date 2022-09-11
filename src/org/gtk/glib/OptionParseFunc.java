package org.gtk.glib;

@FunctionalInterface
public interface OptionParseFunc {

        void onOptionParseFunc(OptionContext context, OptionGroup group);
}
