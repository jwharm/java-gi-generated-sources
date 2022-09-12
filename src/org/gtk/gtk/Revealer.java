package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkRevealer` animates the transition of its child from invisible to visible.
 * 
 * The style of transition can be controlled with
 * [method@Gtk.Revealer.set_transition_type].
 * 
 * These animations respect the [property@Gtk.Settings:gtk-enable-animations]
 * setting.
 * 
 * # CSS nodes
 * 
 * `GtkRevealer` has a single CSS node with name revealer.
 * When styling `GtkRevealer` using CSS, remember that it only hides its contents,
 * not itself. That means applied margin, padding and borders will be visible even
 * when the [property@Gtk.Revealer:reveal-child] property is set to %FALSE.
 * 
 * # Accessibility
 * 
 * `GtkRevealer` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 * 
 * The child of `GtkRevealer`, if set, is always available in the accessibility
 * tree, regardless of the state of the revealer widget.
 */
public class Revealer extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Revealer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Revealer */
    public static Revealer castFrom(org.gtk.gobject.Object gobject) {
        return new Revealer(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_revealer_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkRevealer`.
     */
    public Revealer() {
        super(constructNew());
    }
    
    /**
     * Gets the child widget of @revealer.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_revealer_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the child is fully revealed.
     * 
     * In other words, this returns whether the transition
     * to the revealed state is completed.
     */
    public boolean getChildRevealed() {
        var RESULT = gtk_h.gtk_revealer_get_child_revealed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the child is currently revealed.
     * 
     * This function returns %TRUE as soon as the transition
     * is to the revealed state is started. To learn whether
     * the child is fully revealed (ie the transition is completed),
     * use [method@Gtk.Revealer.get_child_revealed].
     */
    public boolean getRevealChild() {
        var RESULT = gtk_h.gtk_revealer_get_reveal_child(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the amount of time (in milliseconds) that
     * transitions will take.
     */
    public int getTransitionDuration() {
        var RESULT = gtk_h.gtk_revealer_get_transition_duration(handle());
        return RESULT;
    }
    
    /**
     * Gets the type of animation that will be used
     * for transitions in @revealer.
     */
    public RevealerTransitionType getTransitionType() {
        var RESULT = gtk_h.gtk_revealer_get_transition_type(handle());
        return RevealerTransitionType.fromValue(RESULT);
    }
    
    /**
     * Sets the child widget of @revealer.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_revealer_set_child(handle(), child.handle());
    }
    
    /**
     * Tells the `GtkRevealer` to reveal or conceal its child.
     * 
     * The transition will be animated with the current
     * transition type of @revealer.
     */
    public void setRevealChild(boolean revealChild) {
        gtk_h.gtk_revealer_set_reveal_child(handle(), revealChild ? 1 : 0);
    }
    
    /**
     * Sets the duration that transitions will take.
     */
    public void setTransitionDuration(int duration) {
        gtk_h.gtk_revealer_set_transition_duration(handle(), duration);
    }
    
    /**
     * Sets the type of animation that will be used for
     * transitions in @revealer.
     * 
     * Available types include various kinds of fades and slides.
     */
    public void setTransitionType(RevealerTransitionType transition) {
        gtk_h.gtk_revealer_set_transition_type(handle(), transition.getValue());
    }
    
}
