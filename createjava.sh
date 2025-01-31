#!/bin/zsh

if [ -z "$1" ]; then
  echo "Usage: javacreate <classname>"
  exit 1
fi

classname="$1"

filename="${classname}.java"

if [ -e "$filename" ]; then
  echo "Error: File $filename already exists."
  exit 1
fi

cat <<EOF > "$filename"
import java.io.*;
import javax.swing.*;

public class ${classname} {
    public static void main(String args) throws IOException {
        System.out.println("grug");
    }
}
EOF

echo "Successfully saved a dozen seconds: $filename"
