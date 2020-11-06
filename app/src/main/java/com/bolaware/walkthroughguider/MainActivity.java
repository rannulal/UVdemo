package com.bolaware.walkthroughguider;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bolaware.walk_through_guider.AnchorView;
import com.bolaware.walk_through_guider.WalkThroughDialog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 1, 18},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"},
        d2 = {"Lcom/bolaware/walkthroughguider/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "launchWalkThroughDialog", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}
)
public final class MainActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        View var10000 = this.findViewById(R.id.rootView);
        Intrinsics.checkExpressionValueIsNotNull(var10000, "findViewById<ConstraintLayout>(R.id.rootView)");
        ((ConstraintLayout)var10000).getViewTreeObserver().addOnGlobalLayoutListener((OnGlobalLayoutListener)(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                MainActivity.this.launchWalkThroughDialog();
                View var10000 = MainActivity.this.findViewById(R.id.rootView);
                Intrinsics.checkExpressionValueIsNotNull(var10000, "findViewById<ConstraintLayout>(R.id.rootView)");
                ((ConstraintLayout)var10000).getViewTreeObserver().removeOnGlobalLayoutListener((OnGlobalLayoutListener)this);
            }
        }));
        ((Button)this.findViewById(R.id.fourthView)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                MainActivity.this.launchWalkThroughDialog();
            }
        }));
    }

    private final void launchWalkThroughDialog() {
        Activity var10002 = (Activity)this;
        AnchorView[] var10003 = new AnchorView[5];
        View var10008 = this.findViewById(R.id.firstView);
        Intrinsics.checkExpressionValueIsNotNull(var10008, "findViewById<TextView>(R.id.firstView)");
        var10003[0] = new AnchorView(var10008, "This is our first view and its an image view which has an image we called launcher");
        var10008 = this.findViewById(R.id.secondView);
        Intrinsics.checkExpressionValueIsNotNull(var10008, "findViewById<TextView>(R.id.secondView)");
        var10003[1] = new AnchorView(var10008, "This is our second view which is a textview and it has an orange colour");
        var10008 = this.findViewById(R.id.thirdView);
        Intrinsics.checkExpressionValueIsNotNull(var10008, "findViewById<EditText>(R.id.thirdView)");
        var10003[2] = new AnchorView(var10008, "This is our third view which is an edittext, do you like it, we like it too");
        var10008 = this.findViewById(R.id.fourthView);
        Intrinsics.checkExpressionValueIsNotNull(var10008, "findViewById<Button>(R.id.fourthView)");
        var10003[3] = new AnchorView(var10008, "Fourth view is a button, which launches our walkthrough dialog");
        var10008 = this.findViewById(R.id.fifthView);
        Intrinsics.checkExpressionValueIsNotNull(var10008, "findViewById<TextView>(R.id.fifthView)");
        var10003[4] = new AnchorView(var10008, "Fifth view is a great view that we are so excited about");
        (new WalkThroughDialog(var10002, CollectionsKt.listOf(var10003))).setAroundColor(R.color.transparentColor).setContentTintColor(android.R.color.white).setHighLighterColor(android.R.color.white).setStepsPageIndicatorTextColor(android.R.color.darker_gray).show();
    }

    public View _$_findCachedViewById(int var1) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }

        View var2 = (View)this._$_findViewCache.get(var1);
        if (var2 == null) {
            var2 = this.findViewById(var1);
            this._$_findViewCache.put(var1, var2);
        }

        return var2;
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }

    }
}