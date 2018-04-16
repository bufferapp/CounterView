# CounterView
A simple Android counter view for showing edittext character counts. This behaves in the same way as our
[BufferTextInputLayout](https://github.com/bufferapp/BufferTextInputLayout) except that it does not wrap
around an EditText view, allowing you to place it elsewhere within your layout.

The CounterView will display the current count of the input content in the edittext. You need to set the max content length allowed using:

    view_counter.counterMaxLength = someNumberValue

You can customise the color of the counter using the app:counterTextColor attribute.

If the input content exceeds this length, the color of the counter will change. This is defaulted as red, but you can change this using the
app:counterErrorTextColor attribute.

The CounterView has 3 different counter types, you can set this mode using the counterMode property.

### Ascending

view_counter.counterMode = CounterMode.ASCENDING

![Ascending counter](../art/ascending.gif)

### Descending

view_counter.counterMode = CounterMode.DESCENDING

![Descending counter](../art/descending.gif)

### Standard

view_counter.counterMode = CounterMode.STANDARD

![Counter](../art/counter.gif)

## Hiding the CounterView

![Hiding the counter](../art/display.gif)

In some cases you may wish to hide the CounterView until there are only a certain
number of characters available for the input text. You can set this value using:

    view_counter.charactersRemainingUntilCounterDisplay = someNumberValue

That way, this means that the counter won't be shown until the user is someNumberValue away from the maximum counter length.

## Using the CounterView

The CounterView, as shown in the sample app, can be added to your layout like so:

    <org.buffer.android.counterview.CounterView
            android:id="@+id/view_counter"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:counterErrorTextColor="@color/colorAccent"
            app:counterTextColor="@color/colorPrimary" />
