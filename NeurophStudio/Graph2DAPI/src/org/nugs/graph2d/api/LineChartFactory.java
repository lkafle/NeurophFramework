package org.nugs.graph2d.api;

import java.awt.geom.Point2D;

/**
 *
 * @author zoran
 */
public interface LineChartFactory<C> {
    
    public C createLineChart(Point2D[] points);
    public C createLineChart(Point2D[] points, Graph2DProperties prop);
    
}
