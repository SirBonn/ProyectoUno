package Terrenos;

import TiposTerrenos.TipoTerreno;

public class Terreno {

      private TipoTerreno tipoTerreno;
      private SuperficieTerreno superficieTerreno;

      public Terreno() {
      }

      
      public Terreno(TipoTerreno tipoTerreno, SuperficieTerreno superficieTerreno) {
            this.tipoTerreno = tipoTerreno;
            this.superficieTerreno = superficieTerreno;
      }

      public TipoTerreno getTipoTerreno() {
            return tipoTerreno;
      }

      public void setTipoTerreno(TipoTerreno tipoTerreno) {
            this.tipoTerreno = tipoTerreno;
      }

      public SuperficieTerreno getSuperficieTerreno() {
            return superficieTerreno;
      }

      public void setSuperficieTerreno(SuperficieTerreno superficieTerreno) {
            this.superficieTerreno = superficieTerreno;
      }
      
      
      
}
