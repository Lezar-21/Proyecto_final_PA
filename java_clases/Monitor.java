package Proyecto_Final.java_clases;


public class Monitor {
    Articulo frente,fin;
    static final int nuMax = 10;
    
    public Monitor(){
        this.frente = null;
        this.fin = null;
    }

    public boolean isEmpty(){
        return frente == null;
    }

    public synchronized void push(Articulo nuevArticulo){
        if(count() <= nuMax){
            if(isEmpty()){
                this.frente = this.fin = nuevArticulo;
            }else{
                this.fin.setSiguiente(nuevArticulo);
                this.fin = nuevArticulo;
              
                notify();
            }
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Limite superado");
        }
        
    }
    //elimina el frente
    public synchronized Articulo pop(){
        Articulo val = this.peek();
        if(isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(this.frente == this.fin){
            frente = fin = null;
            return val;
        }
        this.frente = this.frente.getSiguiente();
        if(this.count()==nuMax) notify();
        return val;
    }

    public Articulo peek(){
        return frente;
    }

    public void imprimir(){
        if(!isEmpty()){
            Monitor aux = new Monitor();
            while(!isEmpty()){
                System.out.println("Dato: "+this.frente.p);
                aux.push(this.frente);
                this.pop();
            }
            while(!aux.isEmpty()){
                this.push(aux.frente);
                aux.pop();
            }
        }
    }

    public int count(){
        if(!isEmpty()){
            int cont = 0;
            Monitor aux = new Monitor();
            while(!isEmpty()){
                aux.push(this.frente);
                this.pop();
            }
            while(!aux.isEmpty()){
                cont++;
                this.push(aux.frente);
                aux.pop();
            }
            return cont;
        }else{
            return 0;
        }
    }
}
