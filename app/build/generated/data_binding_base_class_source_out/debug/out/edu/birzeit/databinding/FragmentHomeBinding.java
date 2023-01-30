// Generated by view binder compiler. Do not edit!
package edu.birzeit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import edu.birzeit.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textViewCity;

  @NonNull
  public final TextView textViewContinent;

  @NonNull
  public final TextView textViewCost;

  @NonNull
  public final TextView textViewCountry;

  @NonNull
  public final TextView textViewDescription;

  @NonNull
  public final TextView textViewLatitude;

  @NonNull
  public final TextView textViewLongitude;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageView2,
      @NonNull TextView textView12, @NonNull TextView textView13, @NonNull TextView textView14,
      @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5,
      @NonNull TextView textView6, @NonNull TextView textViewCity,
      @NonNull TextView textViewContinent, @NonNull TextView textViewCost,
      @NonNull TextView textViewCountry, @NonNull TextView textViewDescription,
      @NonNull TextView textViewLatitude, @NonNull TextView textViewLongitude) {
    this.rootView = rootView;
    this.imageView2 = imageView2;
    this.textView12 = textView12;
    this.textView13 = textView13;
    this.textView14 = textView14;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textViewCity = textViewCity;
    this.textViewContinent = textViewContinent;
    this.textViewCost = textViewCost;
    this.textViewCountry = textViewCountry;
    this.textViewDescription = textViewDescription;
    this.textViewLatitude = textViewLatitude;
    this.textViewLongitude = textViewLongitude;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView2;
      ImageView imageView2 = rootView.findViewById(id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = rootView.findViewById(id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = rootView.findViewById(id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = rootView.findViewById(id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = rootView.findViewById(id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = rootView.findViewById(id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = rootView.findViewById(id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = rootView.findViewById(id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textViewCity;
      TextView textViewCity = rootView.findViewById(id);
      if (textViewCity == null) {
        break missingId;
      }

      id = R.id.textViewContinent;
      TextView textViewContinent = rootView.findViewById(id);
      if (textViewContinent == null) {
        break missingId;
      }

      id = R.id.textViewCost;
      TextView textViewCost = rootView.findViewById(id);
      if (textViewCost == null) {
        break missingId;
      }

      id = R.id.textViewCountry;
      TextView textViewCountry = rootView.findViewById(id);
      if (textViewCountry == null) {
        break missingId;
      }

      id = R.id.textViewDescription;
      TextView textViewDescription = rootView.findViewById(id);
      if (textViewDescription == null) {
        break missingId;
      }

      id = R.id.textViewLatitude;
      TextView textViewLatitude = rootView.findViewById(id);
      if (textViewLatitude == null) {
        break missingId;
      }

      id = R.id.textViewLongitude;
      TextView textViewLongitude = rootView.findViewById(id);
      if (textViewLongitude == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, imageView2, textView12,
          textView13, textView14, textView3, textView4, textView5, textView6, textViewCity,
          textViewContinent, textViewCost, textViewCountry, textViewDescription, textViewLatitude,
          textViewLongitude);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
