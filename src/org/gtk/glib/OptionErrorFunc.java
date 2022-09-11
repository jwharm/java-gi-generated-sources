package org.gtk.glib;

@FunctionalInterface
public interface OptionErrorFunc {

        void onOptionErrorFunc(OptionContext context, OptionGroup group);
}
