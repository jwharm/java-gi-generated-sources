package org.gtk.gtk;

@FunctionalInterface
public interface CustomRequestModeFunc {

    /**
     * Queries a widget for its preferred size request mode.
     */
    public SizeRequestMode onCustomRequestModeFunc(Widget widget);
}
