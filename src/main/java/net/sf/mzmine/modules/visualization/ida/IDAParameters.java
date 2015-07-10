/*
 * Copyright 2006-2015 The MZmine 2 Development Team
 * 
 * This file is part of MZmine 2.
 * 
 * MZmine 2 is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * MZmine 2 is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * MZmine 2; if not, write to the Free Software Foundation, Inc., 51 Franklin St,
 * Fifth Floor, Boston, MA 02110-1301 USA
 */

package net.sf.mzmine.modules.visualization.ida;

import net.sf.mzmine.parameters.Parameter;
import net.sf.mzmine.parameters.impl.SimpleParameterSet;
import net.sf.mzmine.parameters.parametertypes.ComboParameter;
import net.sf.mzmine.parameters.parametertypes.MZRangeParameter;
import net.sf.mzmine.parameters.parametertypes.RTRangeParameter;
import net.sf.mzmine.parameters.parametertypes.RawDataFilesParameter;
import net.sf.mzmine.parameters.parametertypes.WindowSettingsParameter;

/**
 * IDA visualizer parameter set
 */
public class IDAParameters extends SimpleParameterSet {

    public static final RawDataFilesParameter dataFiles = new RawDataFilesParameter(
	    1, 1);

    public static final RTRangeParameter retentionTimeRange = new RTRangeParameter();

    public static final MZRangeParameter mzRange = new MZRangeParameter();
    
    public static final ComboParameter<IntensityType> intensityType = new ComboParameter<IntensityType>(
            "Intensity normalization",
            "The intensity of the data points can calculated based on either\n- total intensity of the MS/MS scan\n- intensity of the precursor ion in the MS scan",
            IntensityType.values());

    public static final PeakThresholdParameter peakThresholdSettings = new PeakThresholdParameter();

    /**
     * Windows size and position
     */
    public static final WindowSettingsParameter windowSettings = new WindowSettingsParameter();

    public IDAParameters() {
	super(new Parameter[] { dataFiles, retentionTimeRange,
		mzRange, intensityType, peakThresholdSettings, windowSettings });
    }

}
