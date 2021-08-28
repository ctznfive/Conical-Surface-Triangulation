# Computation of the triangulation on a conical surface

### A small program in Java that compute coordinates of triangle nodes used to display a conical surface.

1. Uses the following command-line arguments as parameters: cone height, radius and number of segments on a circle.
2. Prints coordinates of triangle nodes in counter-clockwise order.
3. Prints a conical surface normal (3D vector) at each point P(i).

A cone can be easily represented with N triangles (where N is a number of segments along its circle).

Each triangle is composed of three nodes ( A, P<sub>i</sub> , P<sub>i+1</sub> ).

X, Y, Z coordinates of a node:
- A: {0, 0, H}, where H is a cone height

![image](https://user-images.githubusercontent.com/48520029/131226418-a8eb585d-fff5-4405-b3c1-26c9ce524128.png)

- P<sub>i</sub> : {R * cos (2π * i / N), R * sin (2π * i / N), 0 } , where i=0, N-1

![image](https://user-images.githubusercontent.com/48520029/131226424-7f4dd000-fa5a-460b-bcca-51dffe6f7811.png)

---

### Usage:

Compile:

    javac ConicalTriangulation.java

Run:

    java ConicalTriangulation [h] [r] [n]

or

    java ConicalTriangulation [h] [r] [n] > results.txt

    less results.txt

where
- `h` - the cone height H
- `r` - the radius R
- `n` - the number of segments N
