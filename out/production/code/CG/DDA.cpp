#include<stdio.h> 
#include<stdlib.h> 
#include<graphics.h>
void DDA(float xi,float yi,float xe,float ye)
	{	int x,y;
		x = xi;
		float dx,dy,k;
		dx = xe -xi;dy = ye - yi;
		k = (float)(dy/dx);
		if(k < 1)
		{	k = 1/k;
			initgraph(1080,720);
		for(int y = yi;y < ye;++y)
			{	putpixel(x,y,RED);
				x = x + k;
			}
	 		getch();
		} 
		else
		{	
			initgraph(1080,720);
		for(int x = xi;x < xe;++x)
			{	putpixel(x,y,RED);
				y = y + k;
			}
	 		getch();
		} 
	}
int main()
{  int xi,yi,xe,ye;
	xi = 200;yi = 100;
	xe = 400;ye = 500;
	DDA(xi,yi,xe,ye);
	return 0;
}
