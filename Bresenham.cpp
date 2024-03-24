#include<stdio.h> 
#include<stdlib.h> 
#include<graphics.h>
void Bresenham(float xi,float yi,float xe,float ye)//–±¬ ¥Û”⁄¡„ 
{
		int x,y,dx,dy,p;
		dx = xe - xi;
		dy = ye - yi;
		p = dy + dy - dx;
		y = yi;
		initgraph(1080,720);
		for (x = xi;x < xe;++x)
			{
				if(p > 0)
					{
						++y;
						putpixel(x,y,RED);
						p = p + dy + dy - dx - dx;
					}
				else
					{
						putpixel(x,y,RED);
						p = p + dy + dy; 
					}
			}
		getch();
}
int main()
{  int xi,yi,xe,ye;
	xi = 100;yi = 100;
	xe = 600;ye = 400;
	Bresenham(xi,yi,xe,ye);
	return 0;
}

