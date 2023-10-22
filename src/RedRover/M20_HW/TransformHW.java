package RedRover.M20_HW;

import java.util.List;

public interface TransformHW <SOURCE,RESULT> {

    List<RESULT> transformOriginal(SOURCE original);
}
