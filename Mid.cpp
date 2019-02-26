#include<stdio.h> 
#include<stdlib.h> 
#include<graphics.h>
void Mid(float xi,float yi,float xe,float ye)//Ğ±ÂÊ´óÓÚ0 
	{	int x,y,a,b,c;
		y = yi;
		a = yi- ye;
		b = ye - yi;
		c= xi*ye - xe*yi;
		int d = 2*a + b;
		initgraph(1080,720);
		
			for( x = xi;x < xe;++x)
				{	if(d < 0)
					{	y = y + 1;
						d = d +2*(a + b);
						putpixel(x,y,RED);
					}
					else
					{	d = d + 2*a;
						putpixel(x,y,RED);
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

