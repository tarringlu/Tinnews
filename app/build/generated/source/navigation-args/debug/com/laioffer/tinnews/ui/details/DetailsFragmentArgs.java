package com.laioffer.tinnews.ui.details;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.laioffer.tinnews.model.Article;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DetailsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailsFragmentArgs __result = new DetailsFragmentArgs();
    bundle.setClassLoader(DetailsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("article")) {
      Article article;
      if (Parcelable.class.isAssignableFrom(Article.class) || Serializable.class.isAssignableFrom(Article.class)) {
        article = (Article) bundle.get("article");
      } else {
        throw new UnsupportedOperationException(Article.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (article == null) {
        throw new IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("article", article);
    } else {
      throw new IllegalArgumentException("Required argument \"article\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Article getArticle() {
    return (Article) arguments.get("article");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("article")) {
      Article article = (Article) arguments.get("article");
      if (Parcelable.class.isAssignableFrom(Article.class) || article == null) {
        __result.putParcelable("article", Parcelable.class.cast(article));
      } else if (Serializable.class.isAssignableFrom(Article.class)) {
        __result.putSerializable("article", Serializable.class.cast(article));
      } else {
        throw new UnsupportedOperationException(Article.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailsFragmentArgs that = (DetailsFragmentArgs) object;
    if (arguments.containsKey("article") != that.arguments.containsKey("article")) {
      return false;
    }
    if (getArticle() != null ? !getArticle().equals(that.getArticle()) : that.getArticle() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getArticle() != null ? getArticle().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailsFragmentArgs{"
        + "article=" + getArticle()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(DetailsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Article article) {
      if (article == null) {
        throw new IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("article", article);
    }

    @NonNull
    public DetailsFragmentArgs build() {
      DetailsFragmentArgs result = new DetailsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setArticle(@NonNull Article article) {
      if (article == null) {
        throw new IllegalArgumentException("Argument \"article\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("article", article);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Article getArticle() {
      return (Article) arguments.get("article");
    }
  }
}
