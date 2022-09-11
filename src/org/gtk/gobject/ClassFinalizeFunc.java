package org.gtk.gobject;

@FunctionalInterface
public interface ClassFinalizeFunc {

        void onClassFinalizeFunc(TypeClass gClass);
}
