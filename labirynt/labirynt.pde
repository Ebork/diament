int rozmiar;
int x, y;

void setup()
{
  frameRate(5000);
  size(1500, 500);
  rozmiar = 10;
  x= 0;
  y= 0;
}


void draw()
{
  int los = (int)random(0, 100);
  if (los > 50)
    line( x, y, x+rozmiar, y+ rozmiar );
    else
  line(x, y+rozmiar, x+rozmiar, y );
  x = x + rozmiar;
  if ( x >= width )
  {
    x = 0;
    y = y + rozmiar;
  }
}