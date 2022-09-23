package org.gnome.adw;

/**
 * Prototype for animation targets based on user callbacks.
 */
@FunctionalInterface
public interface AnimationTargetFunc {
        void onAnimationTargetFunc(double value);
}
