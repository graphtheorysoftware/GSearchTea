// GraphTea Project: http://github.com/graphtheorysoftware/GraphTea
// Copyright (C) 2012 Graph Theory Software Foundation: http://GraphTheorySoftware.com
// Copyright (C) 2008 Mathematical Science Department of Sharif University of Technology
// Distributed under the terms of the GNU General Public License (GPL): http://www.gnu.org/licenses/
package graphtea.plugins.reports;

import graphtea.graph.graph.GraphModel;

/**
 * @author azin azadi

 */
public interface GraphReportInterface<t> {
    public t calculate(GraphModel g);

    /**
    * return the category of report like: connectivity, general, coloring, ...
    **/
    public String getCategory();
}
