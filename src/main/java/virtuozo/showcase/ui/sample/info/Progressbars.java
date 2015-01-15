package virtuozo.showcase.ui.sample.info;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Progress;
import virtuozo.ui.Progress.BarColor;
import virtuozo.ui.Progress.DefaultFormat;
import virtuozo.ui.interfaces.HasComponents;

public class Progressbars implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Progress progress = Progress.create().attachTo(target);
    progress.addBar().worked(5);
    
    progress = Progress.create().attachTo(target);
    progress.addBar().worked(10).format(new DefaultFormat());
    
    progress = Progress.create().attachTo(target);
    progress.addBar().worked(20).css(BarColor.DANGER).format(new DefaultFormat());
    
    progress = Progress.create().attachTo(target);
    progress.addBar().worked(40).css(BarColor.INFO).format(new DefaultFormat());
    
    progress = Progress.create().attachTo(target);
    progress.addBar().worked(60).css(BarColor.SUCCESS).format(new DefaultFormat());
    
    progress = Progress.create().attachTo(target);
    progress.addBar().worked(80).css(BarColor.WARNING).format(new DefaultFormat());
    
    progress = Progress.create().attachTo(target).css(Progress.ProgressType.STRIPED);
    progress.addBar().worked(100);
    
    progress = Progress.create().attachTo(target).css(Progress.ProgressType.ANIMATED);
    progress.addBar().worked(80).css(BarColor.INFO);
    
    progress = Progress.create().attachTo(target).total(200);
    progress.addBar().worked(20).css(BarColor.DANGER).format(new DefaultFormat());
    progress.addBar().worked(30).css(BarColor.INFO).format(new DefaultFormat());
    progress.addBar().worked(40).css(BarColor.SUCCESS).format(new DefaultFormat());
    progress.addBar().worked(20).css(BarColor.WARNING).format(new DefaultFormat());
  }
  
  @Override
  public String title() {
    return "Progress";
  }
}