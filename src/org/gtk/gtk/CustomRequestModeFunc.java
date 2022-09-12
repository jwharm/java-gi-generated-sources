package org.gtk.gtk;

/**
 * Queries a widget for its preferred size request mode.
 */
@FunctionalInterface
public interface CustomRequestModeFunc {
        SizeRequestMode onCustomRequestModeFunc(Widget widget);
}
