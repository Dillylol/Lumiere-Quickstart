package org.firstinspires.ftc.teamcode.simulation;

import static org.junit.Assume.assumeTrue;

import dev.lumiere.sim.Simulator;

import org.junit.Test;

/**
 * Starts the desktop simulator for Lumière. It only runs when Lumière launches it; a normal
 * test run skips it.
 */
public class RunSimulator {
    @Test
    public void run() throws Exception {
        assumeTrue("Started by Lumière", Simulator.isRequested());
        Simulator.runFromSystemProperties();
    }
}
