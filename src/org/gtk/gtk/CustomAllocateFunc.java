package org.gtk.gtk;

@FunctionalInterface
public interface CustomAllocateFunc {

        void onCustomAllocateFunc(Widget widget, int width, int height);
}
