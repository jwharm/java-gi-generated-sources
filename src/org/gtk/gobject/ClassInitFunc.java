package org.gtk.gobject;

@FunctionalInterface
public interface ClassInitFunc {

        void onClassInitFunc(TypeClass gClass);
}
