package org.gtk.glib;

@FunctionalInterface
public interface TestFixtureFunc {

        void onTestFixtureFunc(jdk.incubator.foreign.MemoryAddress fixture);
}
