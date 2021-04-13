package Granjero;

import Items.*;
import Plantas.Maiz;
import javax.swing.JLabel;

/**
 *
 * @author byron
 */
public class Inventario {

      private Item aguacate = new Aguacates(0);
      private Item becerro = new Becerro(1);
      private Item carneCerdo = new CarneCerdo(0);
      private Item carnePollo = new CarnePollo(0);
      private Item carneRes = new CarneRes(0);
      private Item cerdo = new Cerdo(0);
      private Item frijol = new Frijol(0);
      private Item huevo = new Huevo(0);
      private Item leche = new Leche(0);
      private Item mazorca = new Mazorca(0);
      private Item pollito = new Pollito(0);
      private Item semillaAgua = new SemillaAguacate(0);
      private Item semillaFrijol = new SemillaFrijol(1);
      private Item semillaMaiz = new SemillaMaiz(1);
      private Item semillaTamarindo = new SemillaTamarindo(1);
      private Item tamarindo = new Tamarindo(0);
      private JLabel labelaguacate;
      private JLabel labelbecerros;
      private JLabel labelcCerdito;
      private JLabel labelcPollo;
      private JLabel labelcRes;
      private JLabel labelcerditos;
      private JLabel labelfrijol;
      private JLabel labelhuevos;
      private JLabel labelleche;
      private JLabel labelmaiz;
      private JLabel labelpollitos;
      private JLabel labelsAgucate;
      private JLabel labelsFrijol;
      private JLabel labelsMaiz;
      private JLabel labelsTamarindo;
      private JLabel labeltamarindoC;

      public Inventario() {
      }

      public void actualizarInventario() {
            labelmaiz.setText("Mazorcas: " + mazorca.getCantidad());
            labelaguacate.setText("Aguacates: " + aguacate.getCantidad());
            labelbecerros.setText("Becerros: " + becerro.getCantidad());
            labelcCerdito.setText("Filetes de cerdos: " + carneCerdo.getCantidad());
            labelcPollo.setText("Pechuguitas de pollo: " + carnePollo.getCantidad());
            labelcRes.setText("Filetes de res: " + carneRes.getCantidad());
            labelcerditos.setText("Cerdos: " + cerdo.getCantidad());
            labelfrijol.setText("Frijol: " + frijol.getCantidad());
            labelhuevos.setText("Huevos: " + huevo.getCantidad());
            labelleche.setText("Litros de leche: " + leche.getCantidad());
            labelmaiz.setText("Mazorcas: " + mazorca.getCantidad());
            labelpollitos.setText("Pollitos: " + pollito.getCantidad());
            labelsAgucate.setText("Retoños de aguacate: " + semillaAgua.getCantidad());
            labelsFrijol.setText("Semillas de frijol: " + semillaFrijol.getCantidad());
            labelsMaiz.setText("Semillas de Maiz: " + semillaMaiz.getCantidad());
            labelsTamarindo.setText("Tamarindo: " + tamarindo.getCantidad());
            labeltamarindoC.setText("Retoño de tamarindo: " + semillaTamarindo.getCantidad());
      }

      public Item getAguacate() {
            return aguacate;
      }

      public void setAguacate(Item aguacate) {
            this.aguacate = aguacate;
      }

      public Item getBecerro() {
            return becerro;
      }

      public void setBecerro(Item becerro) {
            this.becerro = becerro;
      }

      public Item getCarneCerdo() {
            return carneCerdo;
      }

      public void setCarneCerdo(Item carneCerdo) {
            this.carneCerdo = carneCerdo;
      }

      public Item getCarnePollo() {
            return carnePollo;
      }

      public void setCarnePollo(Item carnePollo) {
            this.carnePollo = carnePollo;
      }

      public Item getCarneRes() {
            return carneRes;
      }

      public void setCarneRes(Item carneRes) {
            this.carneRes = carneRes;
      }

      public Item getCerdo() {
            return cerdo;
      }

      public void setCerdo(Item cerdo) {
            this.cerdo = cerdo;
      }

      public Item getFrijol() {
            return frijol;
      }

      public void setFrijol(Item frijol) {
            this.frijol = frijol;
      }

      public Item getHuevo() {
            return huevo;
      }

      public void setHuevo(Item huevo) {
            this.huevo = huevo;
      }

      public Item getLeche() {
            return leche;
      }

      public void setLeche(Item leche) {
            this.leche = leche;
      }

      public Item getMazorca() {
            return mazorca;
      }

      public void setMazorca(Item mazorca) {
            this.mazorca = mazorca;
      }

      public Item getPollito() {
            return pollito;
      }

      public void setPollito(Item pollito) {
            this.pollito = pollito;
      }

      public Item getSemillaAgua() {
            return semillaAgua;
      }

      public void setSemillaAgua(Item semillaAgua) {
            this.semillaAgua = semillaAgua;
      }

      public Item getSemillaFrijol() {
            return semillaFrijol;
      }

      public void setSemillaFrijol(Item semillaFrijol) {
            this.semillaFrijol = semillaFrijol;
      }

      public Item getSemillaMaiz() {
            return semillaMaiz;
      }

      public void setSemillaMaiz(Item semillaMaiz) {
            this.semillaMaiz = semillaMaiz;
      }

      public Item getSemillaTamarindo() {
            return semillaTamarindo;
      }

      public void setSemillaTamarindo(Item semillaTamarindo) {
            this.semillaTamarindo = semillaTamarindo;
      }

      public Item getTamarindo() {
            return tamarindo;
      }

      public void setTamarindo(Item tamarindo) {
            this.tamarindo = tamarindo;
      }

      public JLabel getLabelaguacate() {
            return labelaguacate;
      }

      public void setLabelaguacate(JLabel labelaguacate) {
            this.labelaguacate = labelaguacate;
      }

      public JLabel getLabelbecerros() {
            return labelbecerros;
      }

      public void setLabelbecerros(JLabel labelbecerros) {
            this.labelbecerros = labelbecerros;
      }

      public JLabel getLabelcCerdito() {
            return labelcCerdito;
      }

      public void setLabelcCerdito(JLabel labelcCerdito) {
            this.labelcCerdito = labelcCerdito;
      }

      public JLabel getLabelcPollo() {
            return labelcPollo;
      }

      public void setLabelcPollo(JLabel labelcPollo) {
            this.labelcPollo = labelcPollo;
      }

      public JLabel getLabelcRes() {
            return labelcRes;
      }

      public void setLabelcRes(JLabel labelcRes) {
            this.labelcRes = labelcRes;
      }

      public JLabel getLabelcerditos() {
            return labelcerditos;
      }

      public void setLabelcerditos(JLabel labelcerditos) {
            this.labelcerditos = labelcerditos;
      }

      public JLabel getLabelfrijol() {
            return labelfrijol;
      }

      public void setLabelfrijol(JLabel labelfrijol) {
            this.labelfrijol = labelfrijol;
      }

      public JLabel getLabelhuevos() {
            return labelhuevos;
      }

      public void setLabelhuevos(JLabel labelhuevos) {
            this.labelhuevos = labelhuevos;
      }

      public JLabel getLabelleche() {
            return labelleche;
      }

      public void setLabelleche(JLabel labelleche) {
            this.labelleche = labelleche;
      }

      public JLabel getLabelmaiz() {
            return labelmaiz;
      }

      public void setLabelmaiz(JLabel labelmaiz) {
            this.labelmaiz = labelmaiz;
      }

      public JLabel getLabelpollitos() {
            return labelpollitos;
      }

      public void setLabelpollitos(JLabel labelpollitos) {
            this.labelpollitos = labelpollitos;
      }

      public JLabel getLabelsAgucate() {
            return labelsAgucate;
      }

      public void setLabelsAgucate(JLabel labelsAgucate) {
            this.labelsAgucate = labelsAgucate;
      }

      public JLabel getLabelsFrijol() {
            return labelsFrijol;
      }

      public void setLabelsFrijol(JLabel labelsFrijol) {
            this.labelsFrijol = labelsFrijol;
      }

      public JLabel getLabelsMaiz() {
            return labelsMaiz;
      }

      public void setLabelsMaiz(JLabel labelsMaiz) {
            this.labelsMaiz = labelsMaiz;
      }

      public JLabel getLabelsTamarindo() {
            return labelsTamarindo;
      }

      public void setLabelsTamarindo(JLabel labelsTamarindo) {
            this.labelsTamarindo = labelsTamarindo;
      }

      public JLabel getLabeltamarindoC() {
            return labeltamarindoC;
      }

      public void setLabeltamarindoC(JLabel labeltamarindoC) {
            this.labeltamarindoC = labeltamarindoC;
      }
}
