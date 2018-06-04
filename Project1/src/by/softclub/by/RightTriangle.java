package by.softclub.by;

public class RightTriangle {
    Point pointA, pointB, pointAngularRight;
    Segment legTriangle1, legTriangle2, hupotinuse;
    double lengthLegTriangle1, lengthLegTriangle2, lengthHupotinuse;
    //    Angular angularRight;

    public RightTriangle(Segment legTriangle1, Segment legTriangle2) {
        pointAngularRight = legTriangle1.getPointOneSeg();
        pointA = legTriangle1.getPointTwoSeg();
        pointB = legTriangle2.getPointTwoSeg();
        hupotinuse = new Segment(pointA, pointB);
        lengthHupotinuse = hupotinuse.lengthOfSegment();
        lengthLegTriangle1 = legTriangle1.lengthOfSegment();
        lengthLegTriangle2 = legTriangle2.lengthOfSegment();
    }
    
    public boolean isSimilarTriangle (RightTriangle rightTriangle){
        if (this.lengthHupotinuse/rightTriangle.lengthHupotinuse == this.lengthLegTriangle1/rightTriangle.lengthLegTriangle1 &&  
            this.lengthLegTriangle1/rightTriangle.lengthLegTriangle1 == this.lengthLegTriangle2/rightTriangle.lengthLegTriangle2 || 
            this.lengthHupotinuse/rightTriangle.lengthHupotinuse == this.lengthLegTriangle2/rightTriangle.lengthLegTriangle1 &&  
            this.lengthLegTriangle1/rightTriangle.lengthLegTriangle1 == this.lengthLegTriangle1/rightTriangle.lengthLegTriangle2){
            System.out.println("Right Triangles are similar");
            return true;
        }else{
            System.out.println("Right Triangles are NOT similar");
            return false;
        }
    }  
}
