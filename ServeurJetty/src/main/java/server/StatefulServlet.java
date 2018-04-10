package server;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class StatefulServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	public static final long SUM=10000;
	private long counterA= SUM;
	private long counterB=0;
	private boolean fromAToB= true;
	private long impossibleCounter=0;
	private long slowTransfert(final long v, final long delta) {
		System.err.print("");
		System.err.print("");System.err.print("");System.err.print("");System.err.print("");System.err.print("");System.err.print("");System.err.print("");System.err.print("");System.err.print("");System.err.print("");System.err.print("");
		return	v+delta;	
	}
    @Override
    public synchronized void service( ServletRequest request,
                          ServletResponse response ) throws ServletException,
                                                        IOException {
    	if (fromAToB) {
        	if(counterA > 0) {
        		counterB=slowTransfert(counterB, 1);
        		counterA=slowTransfert(counterA, -1);
        	}else {
        		fromAToB=false;
        	}
        }else {
        	if(counterB > 0) {
        		counterA=slowTransfert(counterA, 1);
        		counterB=slowTransfert(counterB, -1);
        	}else {
        		fromAToB= true;
        	}
        }
    	if((counterA+counterB) != SUM) {
        	++impossibleCounter;
        }
        response.getWriter().println("a= "+counterA+" b= "+counterB+" sum = "+
        (counterA+counterB)+"\n going from "+
        (fromAToB ? "A to B":"B to A")+"\n impossible count="+impossibleCounter+"\n");        
    }
}