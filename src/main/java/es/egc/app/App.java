package es.egc.app;
import java.net.*;
import org.apache.log4j.*;
import org.jgrapht.*;
import org.jgrapht.graph.*;

public class App 
{
    static Logger log=Logger.getLogger(App.class); 
    static int getVal(){
        return 1;
    }
    public static void main( String[] args )
    {
        log.info("Returning 1");
        System.out.println( "Hello World!" );

        UndirectedGraph<String, DefaultEdge> stringGraph = createStringGraph();

        // note undirected edges are printed as: {<v1>,<v2>}
        System.out.println(stringGraph.toString());
    }

    private static UndirectedGraph<String, DefaultEdge> createStringGraph()
    {
        UndirectedGraph<String, DefaultEdge> g =
            new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);

        String v1 = "v1";
        String v2 = "v2";
        String v3 = "v3";
        String v4 = "v4";

        // add the vertices
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);

        // add edges to create a circuit
        g.addEdge(v1, v2);
        g.addEdge(v2, v3);
        g.addEdge(v3, v4);
        g.addEdge(v4, v1);

        return g;
    }
}
